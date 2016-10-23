package org.peoplehelper.rest.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.peoplehelper.rest.database.ProviderRepository;
import org.peoplehelper.rest.database.model.ClientDBO;
import org.peoplehelper.rest.database.model.ProviderDBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping(value = "/provider")
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Autowired
    private ResourceLoader resourceLoader;

    @RequestMapping(value = "buildDb", method = RequestMethod.GET)
    public void buildDb() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:data/provider.json");
        InputStream stream = resource.getInputStream();

        ObjectMapper mapper1 = new ObjectMapper();
        mapper1.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ProviderDBO[] list1 = mapper1.readValue(stream, ProviderDBO[].class);

        providerRepository.deleteAll();
        providerRepository.save(Arrays.asList(list1));
    }

    @RequestMapping(value = "/getProvidersByDistance", method = RequestMethod.GET)
    public List<ProviderDBO> getProvidersByDistance(@RequestParam("lat") String lat, @RequestParam("lon") String lon) {
        List<ProviderDBO> providerDBOList = (List<ProviderDBO>) providerRepository.findAll();

        double myLat = Double.valueOf(lat);
        double myLon = Double.valueOf(lon);

        Comparator comp = (Comparator<ProviderDBO>) (o, o2) -> {
            if(o.getLat() == null || o.getLon() == null || "".equals(o.getLat()) || "".equals(o.getLon())) return -1;

            Double d1 = getDistance(myLat, myLon, Double.valueOf(o.getLat()), Double.valueOf(o.getLon()));
            Double d2 = getDistance(myLat, myLon, Double.valueOf(o2.getLat()), Double.valueOf(o2.getLon()));

            return d1.compareTo(d2);
        };

        Collections.sort(providerDBOList, comp);

        return providerDBOList;
    }

    private double getDistance(double fromLat, double fromLon, double toLat, double toLon){
        double radius = 6371;   // Earth radius in km
        double deltaLat = Math.toRadians(toLat - fromLat);
        double deltaLon = Math.toRadians(toLon - fromLon);
        double lat1 = Math.toRadians(fromLat);
        double lat2 = Math.toRadians(toLat);
        double aVal = Math.sin(deltaLat/2) * Math.sin(deltaLat/2) +
                Math.sin(deltaLon/2) * Math.sin(deltaLon/2) * Math.cos(lat1) * Math.cos(lat2);
        double cVal = 2*Math.atan2(Math.sqrt(aVal), Math.sqrt(1-aVal));

        double distance = radius*cVal;
        return distance;
    }

}

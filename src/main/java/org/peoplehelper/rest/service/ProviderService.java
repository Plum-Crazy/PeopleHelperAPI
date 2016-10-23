package org.peoplehelper.rest.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.peoplehelper.rest.database.ProviderRepository;
import org.peoplehelper.rest.database.model.ClientDBO;
import org.peoplehelper.rest.database.model.ProviderDBO;
import org.peoplehelper.rest.dto.DeductRoomsRequest;
import org.peoplehelper.rest.dto.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

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

    @RequestMapping(value = "/deductRooms", method = RequestMethod.POST)
    @CrossOrigin
    public GenericResponse deductRooms(@RequestBody DeductRoomsRequest request) {
        GenericResponse response = new GenericResponse();

        // validate params
        if(request.getProviderId() < 1 || request.getRoomCount() < 1) {
            response.setSuccess(false);
            return response;
        }

        ProviderDBO dbo = providerRepository.findById(request.getProviderId());
        if(dbo == null) {
            response.setSuccess(false);
            return response;
        }

        int rooms = dbo.getAvailableRooms();

        // make sure enough rooms are available for this
        if(rooms < request.getRoomCount()) {
            response.setSuccess(false);
            return response;
        }

        // set new available rooms
        dbo.setAvailableRooms(dbo.getAvailableRooms() - request.getRoomCount());
        dbo = providerRepository.save(dbo);

        // rooms were not deducted
        if(dbo.getAvailableRooms() == rooms) {
            response.setSuccess(false);
            return response;
        }

        response.setSuccess(true);
        return response;
    }

    @RequestMapping(value = "/getProvider", method = RequestMethod.GET)
    @CrossOrigin
    public ProviderDBO getProvider(@RequestParam("providerId") long providerId) {
        return providerRepository.findById(providerId);
    }

    @RequestMapping(value = "/getProvidersByDistanceWithRooms", method = RequestMethod.GET)
    @CrossOrigin
    public List<ProviderDBO> getProvidersByDistanceWithRooms(@RequestParam("lat") String lat, @RequestParam("lon") String lon) {
        List<ProviderDBO> list = getProvidersByDistance(lat, lon);

        if(list == null || list.size() < 1) return null;

        List<ProviderDBO> newList = new ArrayList<>();

        for(ProviderDBO provider : list) {
            if(provider.getAvailableRooms() != null && provider.getAvailableRooms() > 0) {
                newList.add(provider);
            }
        }

        return newList;
    }

    @RequestMapping(value = "/getProvidersByDistance", method = RequestMethod.GET)
    @CrossOrigin
    public List<ProviderDBO> getProvidersByDistance(@RequestParam("lat") String lat, @RequestParam("lon") String lon) {
        List<ProviderDBO> providerDBOList = (List<ProviderDBO>) providerRepository.findAll();

        double myLat = Double.valueOf(lat);
        double myLon = Double.valueOf(lon);

        Comparator comp = (Comparator<ProviderDBO>) (o, o2) -> {
            if(o.getLat() == null || o.getLon() == null || "".equals(o.getLat()) || "".equals(o.getLon())) return -1;
            if(o2.getLat() == null || o2.getLon() == null || "".equals(o2.getLat()) || "".equals(o2.getLon())) return -1;

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

package org.peoplehelper.rest.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.peoplehelper.rest.database.ClientRepository;
import org.peoplehelper.rest.database.DisabilityRepository;
import org.peoplehelper.rest.database.model.ClientDBO;
import org.peoplehelper.rest.database.model.DisabilityDBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private DisabilityRepository disabilityRepository;

    @Autowired
    private ResourceLoader resourceLoader;

    @RequestMapping(value = "/getClientList", method = RequestMethod.GET)
    @CrossOrigin
    public List<ClientDBO> getClientList() {
        return (List<ClientDBO>) clientRepository.findAll();
    }

    @RequestMapping(value = "/getClient", method = RequestMethod.GET)
    @CrossOrigin
    public ClientDBO getClientList(@RequestParam("id") long id) {
        return clientRepository.findByUuid(id);
    }

    @RequestMapping(value = "/buildDb", method = RequestMethod.GET)
    public String convert() throws IOException {

        Resource resource = resourceLoader.getResource("classpath:data/Client.json");
        InputStream stream = resource.getInputStream();

        ObjectMapper mapper1 = new ObjectMapper();
        mapper1.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ClientDBO[] list1 = mapper1.readValue(stream, ClientDBO[].class);

        clientRepository.deleteAll();
        clientRepository.save(Arrays.asList(list1));


        resource = resourceLoader.getResource("classpath:data/Disabilities.json");
        stream = resource.getInputStream();

        ObjectMapper mapper2 = new ObjectMapper();
        mapper2.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        DisabilityDBO[] list2 = mapper2.readValue(stream, DisabilityDBO[].class);

        disabilityRepository.deleteAll();
        disabilityRepository.save(Arrays.asList(list2));

        return "success: " + list2.length;
    }

}

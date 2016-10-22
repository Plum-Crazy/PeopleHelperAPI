package org.peoplehelper.rest.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.peoplehelper.rest.database.ClientRepository;
import org.peoplehelper.rest.database.model.ClientDBO;
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
import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ResourceLoader resourceLoader;

    @RequestMapping(value = "/getClientList", method = RequestMethod.GET)
    public List<ClientDBO> getClientList() {
        return (List<ClientDBO>) clientRepository.findAll();
    }

    @RequestMapping(value = "/getClient", method = RequestMethod.GET)
    public ClientDBO getClientList(@RequestParam("id") long id) {
        return clientRepository.findByUuid(id);
    }

    @RequestMapping(value = "/convert", method = RequestMethod.GET)
    public String convert() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:data/Client.json");
        InputStream stream = resource.getInputStream();

        ObjectMapper mapper = new ObjectMapper();
        ClientDBO[] list = mapper.readValue(stream, ClientDBO[].class);

        clientRepository.deleteAll();

        clientRepository.save(Arrays.asList(list));

        return "success: " + list.length;
    }

}

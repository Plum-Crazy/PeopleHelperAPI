package org.peoplehelper.rest.service;

import org.peoplehelper.rest.database.ClientRepository;
import org.peoplehelper.rest.database.model.ClientDBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/client")
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "/getClientList", method = RequestMethod.GET)
    public List<ClientDBO> getClientList() {
        return (List<ClientDBO>) clientRepository.findAll();
    }

}

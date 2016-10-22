package org.peoplehelper.rest.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/client")
public class ClientService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMe() {
        return "hello world!";
    }

}

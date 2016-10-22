package org.peoplehelper.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(EmbeddedServletConfiguration.class)
public class PeopleHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleHelperApplication.class, args);
    }

}

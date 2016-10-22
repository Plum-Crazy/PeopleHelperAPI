package org.peoplehelper.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
=======
>>>>>>> c227a2beef737dfc0dd38c7dfb6aa49589425e0f

@SpringBootApplication
@Import(EmbeddedServletConfiguration.class)
public class PeopleHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleHelperApplication.class, args);
    }

}

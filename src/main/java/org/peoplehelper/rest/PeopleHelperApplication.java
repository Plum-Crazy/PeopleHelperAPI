package org.peoplehelper.rest;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

@SpringBootApplication
@Import(EmbeddedServletConfiguration.class)
public class PeopleHelperApplication {

    private static final Logger LOG = Logger.getLogger(PeopleHelperApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PeopleHelperApplication.class, args);
    }

    /*@Bean
    protected ServletContextListener listener() {
        return new ServletContextListener() {

            @Override
            public void contextInitialized(ServletContextEvent sce) {
                LOG.info("Context initialized.");
            }

            @Override
            public final void contextDestroyed(ServletContextEvent sce) {
                LOG.info("Destroying context...");

                try {
                    LOG.info("Calling MySQL AbandonedConnectionCleanupThread shutdown.");
                    AbandonedConnectionCleanupThread.shutdown();
                } catch (InterruptedException e) {
                    LOG.error("Error calling MySQL AbandonedConnectionCleanupThread shutdown.", e);
                }

                ClassLoader cl = Thread.currentThread().getContextClassLoader();

                Enumeration<Driver> drivers = DriverManager.getDrivers();
                while (drivers.hasMoreElements()) {
                    Driver driver = drivers.nextElement();

                    if (driver.getClass().getClassLoader() == cl) {

                        try {
                            LOG.info("Deregistering JDBC driver " + driver);
                            DriverManager.deregisterDriver(driver);
                        } catch (SQLException ex) {
                            LOG.error("Error deregistering JDBC driver " + driver, ex);
                        }

                    } else {
                        LOG.trace("Not deregistering JDBC driver " + driver + " as it does not belong to this webapp's ClassLoader");
                    }
                }
            }
        };
    }*/

}

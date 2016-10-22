package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.ServicesDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository extends CrudRepository<ServicesDBO, Long> {
}

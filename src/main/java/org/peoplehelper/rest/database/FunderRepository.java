package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.FunderDBO;
import org.springframework.data.repository.CrudRepository;


public interface FunderRepository extends CrudRepository<FunderDBO, Long> {
}

package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.DisabilityDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisabilityRepository extends CrudRepository<DisabilityDBO, Long> {
}

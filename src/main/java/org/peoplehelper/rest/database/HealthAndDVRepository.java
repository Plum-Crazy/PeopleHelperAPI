package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.HealthAndDVDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthAndDVRepository extends CrudRepository<HealthAndDVDBO, Long> {
}

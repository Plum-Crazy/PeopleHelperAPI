package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.EnrollmentDBO;
import org.springframework.data.repository.CrudRepository;


public interface EntrollmentRepository extends CrudRepository<EnrollmentDBO, Long> {
}

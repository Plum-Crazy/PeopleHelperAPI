package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.EmploymentEducationDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentEducationRepository extends CrudRepository<EmploymentEducationDBO, Long> {
}

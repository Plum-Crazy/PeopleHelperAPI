package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.ExitDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExitRepository extends CrudRepository<ExitDBO, Long> {
}

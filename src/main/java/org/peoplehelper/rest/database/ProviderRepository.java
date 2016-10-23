package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.ProviderDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends CrudRepository<ProviderDBO, Long> {

    ProviderDBO findById(long id);

}

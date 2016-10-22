package org.peoplehelper.rest.database;

import org.peoplehelper.rest.database.model.ClientDBO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientDBO, Long> {

    public ClientDBO findByUuid(long uuid);

}

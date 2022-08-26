package com.nttda.nttdataservice.nttdata.repository;

import com.nttda.nttdataservice.nttdata.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClientRepository extends CrudRepository<Client, UUID> {

    Optional<Client> findByIdentification(String dni);

}

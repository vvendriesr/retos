package com.eduar.misiontic.games2.repository;

import com.eduar.misiontic.games2.entities.Client;
import com.eduar.misiontic.games2.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save(Client client){
        return clientCrudRepository.save(client);
    }

    public void delete(Client client){
        clientCrudRepository.delete(client);
    }

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
}

package com.example.tablePerClass.service;

import com.example.tablePerClass.model.Client;
import com.example.tablePerClass.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client save (Client c){
        return clientRepository.save(c);
    }

    public Client getClientById (Long id){
        return clientRepository.findById(id).get();
    }
}

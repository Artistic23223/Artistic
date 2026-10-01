package com.artistic.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.artistic.backend.model.Client;
import com.artistic.backend.repository.ClientRepository;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(String id) {
        return clientRepository.findById(id);
    }

    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }
}
package com.artistic.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistic.backend.model.Client;
import com.artistic.backend.service.ClientService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping
    public List<Client> getClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable String id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable String id) {
        clientService.deleteClient(id);
    }
}
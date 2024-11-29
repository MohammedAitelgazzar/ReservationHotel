package com.app.controller;

import com.app.dao.ClientRepository;
import com.app.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    // Get all clients
    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Get client by ID
    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Integer id) {
        return clientRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create new client
    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        try {
            Client savedClient = clientRepository.save(client);
            return ResponseEntity.ok(savedClient);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    // Update client
    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Integer id, 
                                             @RequestBody Client clientDetails) {
        return clientRepository.findById(id)
                .map(existingClient -> {
                    existingClient.setNom(clientDetails.getNom());
                    existingClient.setPrenom(clientDetails.getPrenom());
                    existingClient.setEmail(clientDetails.getEmail());
                    existingClient.setTelephone(clientDetails.getTelephone());
                    Client updatedClient = clientRepository.save(existingClient);
                    return ResponseEntity.ok(updatedClient);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete client
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable Integer id) {
        return clientRepository.findById(id)
                .map(client -> {
                    clientRepository.delete(client);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
} 
package com.artistic.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artistic.backend.model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {
}
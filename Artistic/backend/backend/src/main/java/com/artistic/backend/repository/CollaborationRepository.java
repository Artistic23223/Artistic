package com.artistic.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artistic.backend.model.Collaboration;

public interface CollaborationRepository extends MongoRepository<Collaboration, String> {
}
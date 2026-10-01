package com.artistic.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artistic.backend.model.Artwork;

public interface ArtworkRepository extends MongoRepository<Artwork, String> {
}
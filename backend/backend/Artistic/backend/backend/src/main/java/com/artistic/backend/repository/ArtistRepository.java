package com.artistic.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artistic.backend.model.Artist;

public interface ArtistRepository extends MongoRepository<Artist, String> {
}
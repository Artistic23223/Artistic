package com.artistic.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artistic.backend.model.Portfolio;

public interface PortfolioRepository extends MongoRepository<Portfolio, String> {
}
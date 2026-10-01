package com.artistic.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artistic.backend.model.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
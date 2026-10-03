package com.artistic.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.artistic.backend.model.Notification;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
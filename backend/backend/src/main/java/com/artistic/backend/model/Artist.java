package com.artistic.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "artists")
public class Artist {

    @Id
    private String id;

    private String name;
    private String bio;
    private String specialty; // e.g., Painting, Digital Art, Sculpture
    private String userId;    // Links the artist to a specific User

    public Artist() {
    }

    public Artist(String name, String bio, String specialty, String userId) {
        this.name = name;
        this.bio = bio;
        this.specialty = specialty;
        this.userId = userId;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}
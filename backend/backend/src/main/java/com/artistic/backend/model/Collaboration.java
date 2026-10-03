package com.artistic.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "collaborations")
public class Collaboration {

    @Id
    private String id;

    private String projectTitle;
    private String description;
    private String initiatorArtistId;
    private String collaboratorArtistId;
    private String status; // e.g., INVITED, ACCEPTED, COMPLETED

    public Collaboration() {
    }

    public Collaboration(String projectTitle, String description, String initiatorArtistId, String collaboratorArtistId, String status) {
        this.projectTitle = projectTitle;
        this.description = description;
        this.initiatorArtistId = initiatorArtistId;
        this.collaboratorArtistId = collaboratorArtistId;
        this.status = status;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProjectTitle() { return projectTitle; }
    public void setProjectTitle(String projectTitle) { this.projectTitle = projectTitle; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getInitiatorArtistId() { return initiatorArtistId; }
    public void setInitiatorArtistId(String initiatorArtistId) { this.initiatorArtistId = initiatorArtistId; }

    public String getCollaboratorArtistId() { return collaboratorArtistId; }
    public void setCollaboratorArtistId(String collaboratorArtistId) { this.collaboratorArtistId = collaboratorArtistId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
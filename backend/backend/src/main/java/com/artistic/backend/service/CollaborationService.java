package com.artistic.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.artistic.backend.model.Collaboration;
import com.artistic.backend.repository.CollaborationRepository;

@Service
public class CollaborationService {

    private final CollaborationRepository collaborationRepository;

    public CollaborationService(CollaborationRepository collaborationRepository) {
        this.collaborationRepository = collaborationRepository;
    }

    public Collaboration createCollaboration(Collaboration collaboration) {
        return collaborationRepository.save(collaboration);
    }

    public List<Collaboration> getAllCollaborations() {
        return collaborationRepository.findAll();
    }

    public Optional<Collaboration> getCollaborationById(String id) {
        return collaborationRepository.findById(id);
    }

    public void deleteCollaboration(String id) {
        collaborationRepository.deleteById(id);
    }
}
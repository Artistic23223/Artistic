package com.artistic.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artistic.backend.model.Collaboration;
import com.artistic.backend.service.CollaborationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/collaborations")
public class CollaborationController {

    private final CollaborationService collaborationService;

    public CollaborationController(CollaborationService collaborationService) {
        this.collaborationService = collaborationService;
    }

    @PostMapping
    public Collaboration createCollaboration(@RequestBody Collaboration collaboration) {
        return collaborationService.createCollaboration(collaboration);
    }

    @GetMapping
    public List<Collaboration> getCollaborations() {
        return collaborationService.getAllCollaborations();
    }

    @GetMapping("/{id}")
    public Optional<Collaboration> getCollaborationById(@PathVariable String id) {
        return collaborationService.getCollaborationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCollaboration(@PathVariable String id) {
        collaborationService.deleteCollaboration(id);
    }
}
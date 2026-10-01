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

import com.artistic.backend.model.Artwork;
import com.artistic.backend.service.ArtworkService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/artworks")
public class ArtworkController {

    private final ArtworkService artworkService;

    public ArtworkController(ArtworkService artworkService) {
        this.artworkService = artworkService;
    }

    @PostMapping
    public Artwork createArtwork(@RequestBody Artwork artwork) {
        return artworkService.createArtwork(artwork);
    }

    @GetMapping
    public List<Artwork> getArtworks() {
        return artworkService.getAllArtworks();
    }

    @GetMapping("/{id}")
    public Optional<Artwork> getArtworkById(@PathVariable String id) {
        return artworkService.getArtworkById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteArtwork(@PathVariable String id) {
        artworkService.deleteArtwork(id);
    }
}
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

import com.artistic.backend.model.Artist;
import com.artistic.backend.service.ArtistService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        return artistService.createArtist(artist);
    }

    @GetMapping
    public List<Artist> getArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("/{id}")
    public Optional<Artist> getArtistById(@PathVariable String id) {
        return artistService.getArtistById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable String id) {
        artistService.deleteArtist(id);
    }
}
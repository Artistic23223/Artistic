package com.artistic.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.artistic.backend.model.Artist;
import com.artistic.backend.repository.ArtistRepository;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Optional<Artist> getArtistById(String id) {
        return artistRepository.findById(id);
    }

    public void deleteArtist(String id) {
        artistRepository.deleteById(id);
    }
}
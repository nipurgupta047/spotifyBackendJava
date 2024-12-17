package com.spotifyClone.spotifyBackend.features.fetch.services;

import com.spotifyClone.spotifyBackend.features.fetch.repository.ArtistRepository;
import com.spotifyClone.spotifyBackend.model.artists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistFetchService {

    @Autowired
    private ArtistRepository artistRepository;

    public Optional<artists> fetchArtistById(String id){
        return artistRepository.findById(id);
    }
}

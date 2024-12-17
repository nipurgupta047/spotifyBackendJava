package com.spotifyClone.spotifyBackend.features.fetch.contoller;

import com.spotifyClone.spotifyBackend.features.fetch.services.ArtistFetchService;
import com.spotifyClone.spotifyBackend.model.artists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ArtistFetch {

    @Autowired
    private ArtistFetchService artistFetchService;

    @GetMapping("/artist/{id}")
    public Optional<artists> fetchArtistById(@PathVariable String id){
        return artistFetchService.fetchArtistById(id);
    }

}

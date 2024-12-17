package com.spotifyClone.spotifyBackend.features.fetch.contoller;
import com.spotifyClone.spotifyBackend.features.fetch.services.SpotifyFetchService;
import com.spotifyClone.spotifyBackend.model.spotifyplaylists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SpotifyFetch {

    @Autowired
    private SpotifyFetchService spotifyFetchService;

    @GetMapping("/spotifyPlaylist")
    public List<spotifyplaylists> fetchSpotifyPlaylist(){
        return spotifyFetchService.fetchSpotifyPlaylist();
    }

    @GetMapping("/spotifyPlaylistById/{id}")
    public Optional<spotifyplaylists> fetchSpotifyPlaylistById(@PathVariable String id){
        return spotifyFetchService.fetchSpotifyPlaylistById(id);
    }
}

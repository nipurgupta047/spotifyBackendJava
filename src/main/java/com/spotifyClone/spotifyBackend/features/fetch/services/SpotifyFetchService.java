package com.spotifyClone.spotifyBackend.features.fetch.services;

import com.spotifyClone.spotifyBackend.features.fetch.repository.SpotifyPlaylistRepository;
import com.spotifyClone.spotifyBackend.model.spotifyplaylists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class SpotifyFetchService {

    @Autowired
    private SpotifyPlaylistRepository spotifyPlaylistRepository;

    public List<spotifyplaylists> fetchSpotifyPlaylist(){
//        List<spotifyplaylists> arr1 = new ArrayList<>();
//        spotifyplaylists playlist1 = new spotifyplaylists("1", "play1", new ArrayList<>(Arrays.asList("song1", "song2")));
//        arr1.add(playlist1);
//        arr1 = spotifyPlaylistRepository.findAll();
        return spotifyPlaylistRepository.findAll();
//        return arr1;
    }

    public Optional<spotifyplaylists> fetchSpotifyPlaylistById(String id){
        return spotifyPlaylistRepository.findById(id);
    }

}

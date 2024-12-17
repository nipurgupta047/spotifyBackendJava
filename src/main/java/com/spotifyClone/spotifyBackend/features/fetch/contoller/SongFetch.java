package com.spotifyClone.spotifyBackend.features.fetch.contoller;

import com.spotifyClone.spotifyBackend.features.fetch.services.SongFetchService;
import com.spotifyClone.spotifyBackend.model.songs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SongFetch {

    @Autowired
    private SongFetchService songFetchService;

    @GetMapping("/song/{id}")
    public Optional<songs> fetchSongById(@PathVariable String id){
        return songFetchService.fetchSongById(id);
    }

    @GetMapping("/artistSongs/{id}")
    public List<songs> fetchSongByArtistId(@PathVariable String id){
        return songFetchService.fetchSongByArtistId(id);
    }

}

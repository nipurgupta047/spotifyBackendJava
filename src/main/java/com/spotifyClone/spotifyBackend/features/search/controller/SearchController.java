package com.spotifyClone.spotifyBackend.features.search.controller;

import com.spotifyClone.spotifyBackend.features.search.services.SearchService;
import com.spotifyClone.spotifyBackend.model.artists;
import com.spotifyClone.spotifyBackend.model.songs;
import com.spotifyClone.spotifyBackend.model.spotifyplaylists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("/search/song")
    public List<songs> searchSongs(@RequestBody SearchReq searchReq){
        return searchService.searchSongs(searchReq.getSearchValue());
    }

    @PostMapping("/search/artist")
    public List<artists> searchArtists(@RequestBody SearchReq searchReq){
        return searchService.searchArtists(searchReq.getSearchValue());
    }

    @PostMapping("/search/spotifyPlaylist")
    public List<spotifyplaylists> searchSpotifyPlaylists(@RequestBody SearchReq searchReq){
        return searchService.searchSpotifyPlaylists(searchReq.getSearchValue());
    }

}

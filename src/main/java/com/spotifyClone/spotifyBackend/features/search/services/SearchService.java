package com.spotifyClone.spotifyBackend.features.search.services;

import com.spotifyClone.spotifyBackend.features.search.repository.SearchArtistRepository;
import com.spotifyClone.spotifyBackend.features.search.repository.SearchSongRepository;
import com.spotifyClone.spotifyBackend.features.search.repository.SearchSpotifyPlaylistRepository;
import com.spotifyClone.spotifyBackend.model.artists;
import com.spotifyClone.spotifyBackend.model.songs;
import com.spotifyClone.spotifyBackend.model.spotifyplaylists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchSongRepository searchSongRepository;
    @Autowired
    private SearchArtistRepository searchArtistRepository;
    @Autowired
    private SearchSpotifyPlaylistRepository searchSpotifyPlaylistRepository;

    public List<songs> searchSongs(String searchValue){
        String regex = "(?i)"+searchValue+"(?-i)";
        return searchSongRepository.findBySongName(regex);
    }

    public List<artists> searchArtists(String searchValue) {
        String regex = "(?i)"+searchValue+"(?-i)";
        return searchArtistRepository.findByArtistName(regex);
    }

    public List<spotifyplaylists> searchSpotifyPlaylists(String searchValue) {
        String regex = "(?i)"+searchValue+"(?-i)";
        return searchSpotifyPlaylistRepository.findBySpotifyPlaylistName(regex);
    }
}

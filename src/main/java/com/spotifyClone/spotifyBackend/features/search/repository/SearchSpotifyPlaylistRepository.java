package com.spotifyClone.spotifyBackend.features.search.repository;

import com.spotifyClone.spotifyBackend.model.spotifyplaylists;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SearchSpotifyPlaylistRepository extends MongoRepository<spotifyplaylists, String> {

    @Query("{'playlistName': { $regex: ?0}}")
    List<spotifyplaylists> findBySpotifyPlaylistName(String regex);
}

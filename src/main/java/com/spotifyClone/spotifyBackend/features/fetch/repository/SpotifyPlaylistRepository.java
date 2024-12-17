package com.spotifyClone.spotifyBackend.features.fetch.repository;
import com.spotifyClone.spotifyBackend.model.spotifyplaylists;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpotifyPlaylistRepository extends MongoRepository<spotifyplaylists, String> {

}

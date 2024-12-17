package com.spotifyClone.spotifyBackend.features.fetch.repository;

import com.spotifyClone.spotifyBackend.model.songs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<songs, String> {
}

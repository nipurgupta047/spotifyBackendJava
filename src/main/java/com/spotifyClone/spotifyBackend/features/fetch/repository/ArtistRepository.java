package com.spotifyClone.spotifyBackend.features.fetch.repository;

import com.spotifyClone.spotifyBackend.model.artists;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtistRepository extends MongoRepository<artists, String> {
}

package com.spotifyClone.spotifyBackend.features.search.repository;

import com.spotifyClone.spotifyBackend.model.artists;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SearchArtistRepository extends MongoRepository<artists, String> {

    @Query("{'artistName': { $regex: ?0}}")
    List<artists> findByArtistName(String regex);
}

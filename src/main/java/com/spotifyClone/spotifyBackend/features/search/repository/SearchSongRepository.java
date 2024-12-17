package com.spotifyClone.spotifyBackend.features.search.repository;

import com.spotifyClone.spotifyBackend.model.songs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface SearchSongRepository extends MongoRepository<songs, String> {

    @Query("{'songName': { $regex: ?0}}")
    public List<songs> findBySongName(String regex);

}

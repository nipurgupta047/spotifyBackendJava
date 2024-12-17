package com.spotifyClone.spotifyBackend.features.authentication.repository;

import com.spotifyClone.spotifyBackend.model.users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<users, String> {

    Optional<users> findFirstByUsername(String username);

}

package com.spotifyClone.spotifyBackend.features.userActions;

import com.spotifyClone.spotifyBackend.model.users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserActionsRepository extends MongoRepository<users, String> {
    Optional<users> findFirstByUsername(String username);
}

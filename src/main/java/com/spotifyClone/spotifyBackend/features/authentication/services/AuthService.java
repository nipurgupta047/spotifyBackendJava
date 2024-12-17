package com.spotifyClone.spotifyBackend.features.authentication.services;

import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String isLoggedIn(String token){
        return "this is - " + token;
    }
}

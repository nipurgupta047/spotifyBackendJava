package com.spotifyClone.spotifyBackend.features.authentication.services;

import com.spotifyClone.spotifyBackend.features.authentication.controller.LoginRes;
import com.spotifyClone.spotifyBackend.features.authentication.repository.UserRepository;
import com.spotifyClone.spotifyBackend.model.users;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.*;

@Service
public class AuthService {

    @Value("${JWT_SECRET_KEY}")
    private String JWT_SECRET_KEY;

    @Autowired
    private UserRepository userRepository;

    public String isLoggedIn(String token, String JWT_SECRET_KEY){

        try {
            Map<String, Object> claims = Jwts.parserBuilder()
                                            .setSigningKey(JWT_SECRET_KEY.getBytes())
                                            .build()
                                            .parseClaimsJws(token)
                                            .getBody();
            return claims.get("username").toString();
        }
        catch (Exception e){
            return "";
        }

    }

    public LoginRes login(String username, String password) {

        Optional<users> fetchUser =  userRepository.findFirstByUsername(username);
        if(fetchUser.isPresent()){
            Map<String, Object> mp = new HashMap<>();
            mp.put("username", username);
            Key key = new SecretKeySpec(JWT_SECRET_KEY.getBytes(), SignatureAlgorithm.HS256.getJcaName());
            String token = Jwts.builder()
                            .setClaims(mp)
                            .setIssuedAt(new Date())
                            .setExpiration(new Date(System.currentTimeMillis() + 1000*60*60*24*10) )
                            .signWith(key)
                            .compact();
            return new LoginRes("logged",token);
        }
        else return new LoginRes("Incorrect email/password", "");
    }

}

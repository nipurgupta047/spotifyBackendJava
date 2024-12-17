package com.spotifyClone.spotifyBackend.features.authentication.controller;

import com.spotifyClone.spotifyBackend.features.authentication.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    @Autowired
    AuthService authService;

    @Value("${SALT_ROUNDS}")
    private String SALT_ROUNDS;

    @Value("${JWT_SECRET_KEY}")
    private String JWT_SECRET_KEY;

    @PostMapping("/isLoggedIn")
    public String isLoggedIn(@RequestBody IsLoggedInReq req){
        return authService.isLoggedIn(req.getToken());
    }

    @PostMapping("/login")
    public LoginRes login(@RequestBody LoginReq req){
        return new LoginRes("logged" + req.getUsername(), "abcd" + req.getPassword());
    }

}

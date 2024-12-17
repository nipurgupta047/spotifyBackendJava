package com.spotifyClone.spotifyBackend.features.authentication.controller;

public class IsLoggedInReq {

    private String token;

    public IsLoggedInReq() {
    }

    public IsLoggedInReq(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

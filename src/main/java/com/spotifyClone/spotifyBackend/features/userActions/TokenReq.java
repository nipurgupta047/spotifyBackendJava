package com.spotifyClone.spotifyBackend.features.userActions;

public class TokenReq {
    private String token;

    public TokenReq(){
    }

    public TokenReq(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

package com.spotifyClone.spotifyBackend.features.userActions;

public class UsernameReq {
    private String username;

    public UsernameReq() {
    }

    public UsernameReq(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

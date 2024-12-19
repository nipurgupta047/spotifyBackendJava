package com.spotifyClone.spotifyBackend.features.userActions;

public class UsernameSongIdReq {

    private String username;
    private String songId;

    public UsernameSongIdReq() {
    }

    public UsernameSongIdReq(String username, String songId) {
        this.username = username;
        this.songId = songId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

}

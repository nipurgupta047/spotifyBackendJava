package com.spotifyClone.spotifyBackend.features.userActions;

public class UsernameSongReq {

    private String username;
    private String songId;
    private String songName;
    private String songImageUrl;

    public UsernameSongReq() {
    }

    public UsernameSongReq(String username, String songId, String songName, String songImageUrl) {
        this.username = username;
        this.songId = songId;
        this.songName = songName;
        this.songImageUrl = songImageUrl;
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

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongImageUrl() {
        return songImageUrl;
    }

    public void setSongImageUrl(String songImageUrl) {
        this.songImageUrl = songImageUrl;
    }
}

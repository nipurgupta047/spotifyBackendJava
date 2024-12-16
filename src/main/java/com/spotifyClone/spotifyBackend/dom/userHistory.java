package com.spotifyClone.spotifyBackend.dom;

public class userHistory {
    private String songId;
    private String songName;
    private String songImageUrl;

    public userHistory(String songId, String songName, String songImageUrl) {
        this.songId = songId;
        this.songName = songName;
        this.songImageUrl = songImageUrl;
    }
}

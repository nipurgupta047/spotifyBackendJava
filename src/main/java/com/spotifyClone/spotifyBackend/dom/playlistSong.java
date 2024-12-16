package com.spotifyClone.spotifyBackend.dom;

public class playlistSong {
    private String songId;
    private String songName;
    private String songImageUrl;

    public playlistSong(String songId, String songImageUrl, String songName) {
        this.songId = songId;
        this.songImageUrl = songImageUrl;
        this.songName = songName;
    }
}

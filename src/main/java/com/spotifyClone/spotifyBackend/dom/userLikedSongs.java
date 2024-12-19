package com.spotifyClone.spotifyBackend.dom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class userLikedSongs {
    private String songId;
    private String songName;
    private String songImageUrl;

    public userLikedSongs() {
    }

    public userLikedSongs(String songId, String songName, String songImageUrl) {
        this.songId = songId;
        this.songName = songName;
        this.songImageUrl = songImageUrl;
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

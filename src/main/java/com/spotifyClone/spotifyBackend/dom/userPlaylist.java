package com.spotifyClone.spotifyBackend.dom;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class userPlaylist {
    @Id
    private String _id;
    private String platlistName;
    private ArrayList<playlistSong> playlistSongs;

    public userPlaylist(String _id, ArrayList<playlistSong> playlistSongs, String platlistName) {
        this._id = _id;
        this.playlistSongs = playlistSongs;
        this.platlistName = platlistName;
    }
}

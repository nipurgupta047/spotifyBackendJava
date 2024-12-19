package com.spotifyClone.spotifyBackend.dom;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class userPlaylist {
    @Id
    private String _id;
    private String playlistName;
    private List<playlistSong> playlistSongs;

    public userPlaylist() {
    }

    public userPlaylist(String _id, List<playlistSong> playlistSongs, String playlistName) {
        this._id = _id;
        this.playlistSongs = playlistSongs;
        this.playlistName = playlistName;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public List<playlistSong> getPlaylistSongs() {
        return playlistSongs;
    }

    public void setPlaylistSongs(List<playlistSong> playlistSongs) {
        this.playlistSongs = playlistSongs;
    }
}

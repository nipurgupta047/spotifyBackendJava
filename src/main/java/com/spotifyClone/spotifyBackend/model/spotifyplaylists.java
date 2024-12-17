package com.spotifyClone.spotifyBackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("spotifyplaylists")
public class spotifyplaylists {
    @Id
    private String _id;
    private String playlistName;
    private ArrayList<String> songs;

    public spotifyplaylists() {
    }

    public spotifyplaylists(String _id, String playlistName, ArrayList<String> songs) {
        this._id = _id;
        this.songs = songs;
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

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }
}

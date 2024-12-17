package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.userHistory;
import com.spotifyClone.spotifyBackend.dom.userLikedSongs;
import com.spotifyClone.spotifyBackend.dom.userPlaylist;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("users")
public class users {
    @Id
    private String _id;
    private String username;
    private String profileName;
    private String password;
    private ArrayList<userPlaylist> playlist;
    private ArrayList<userHistory> history;
    private ArrayList<userLikedSongs> likedSongs;
    private String imageUrl;

    public users() {
    }

    public users(String _id, String username, String profileName, String password, ArrayList<userPlaylist> playlist, ArrayList<userHistory> history, ArrayList<userLikedSongs> likedSongs, String imageUrl) {
        this._id = _id;
        this.username = username;
        this.profileName = profileName;
        this.password = password;
        this.playlist = playlist;
        this.history = history;
        this.likedSongs = likedSongs;
        this.imageUrl = imageUrl;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<userPlaylist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<userPlaylist> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<userHistory> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<userHistory> history) {
        this.history = history;
    }

    public ArrayList<userLikedSongs> getLikedSongs() {
        return likedSongs;
    }

    public void setLikedSongs(ArrayList<userLikedSongs> likedSongs) {
        this.likedSongs = likedSongs;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

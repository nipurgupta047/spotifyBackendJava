package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.userHistory;
import com.spotifyClone.spotifyBackend.dom.userLikedSongs;
import com.spotifyClone.spotifyBackend.dom.userPlaylist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
public class users {
    @Id
    private String _id;
    private String username;
    private String profileName;
    private String password;
    private List<userPlaylist> playlist;
    private List<userHistory> history;
    private List<userLikedSongs> likedSongs;
    private String imageUrl;

    public users() {
    }

    public users(String _id, String username, String profileName, String password, List<userPlaylist> playlist, List<userHistory> history, List<userLikedSongs> likedSongs, String imageUrl) {
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

    public List<userPlaylist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<userPlaylist> playlist) {
        this.playlist = playlist;
    }

    public List<userHistory> getHistory() {
        return history;
    }

    public void setHistory(List<userHistory> history) {
        this.history = history;
    }

    public List<userLikedSongs> getLikedSongs() {
        return likedSongs;
    }

    public void setLikedSongs(List<userLikedSongs> likedSongs) {
        this.likedSongs = likedSongs;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

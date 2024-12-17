package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.songArtistObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("songs")
public class songs {
    @Id
    private String _id;
    private String songName;
    private List<songArtistObject> artist;
    private int noOfLikes;
    private String imageUrl;
    private String songUrl;

    public songs() {
    }

    public songs(String _id, String songName, List<songArtistObject> artist, int noOfLikes, String imageUrl, String songUrl) {
        this._id = _id;
        this.songName = songName;
        this.artist = artist;
        this.noOfLikes = noOfLikes;
        this.imageUrl = imageUrl;
        this.songUrl = songUrl;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public List<songArtistObject> getArtist() {
        return artist;
    }

    public void setArtist(List<songArtistObject> artist) {
        this.artist = artist;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
}

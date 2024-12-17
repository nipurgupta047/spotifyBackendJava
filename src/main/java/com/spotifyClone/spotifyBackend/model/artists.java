package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.artistSongsObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("artists")
public class artists {
    @Id
    private String _id;
    private String artistName;
    private String imageUrl;
    private ArrayList<artistSongsObject> songs;

    public artists() {
    }

    public artists(String _id, String artistName, String imageUrl, ArrayList<artistSongsObject> songs) {
        this._id = _id;
        this.artistName = artistName;
        this.imageUrl = imageUrl;
        this.songs = songs;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ArrayList<artistSongsObject> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<artistSongsObject> songs) {
        this.songs = songs;
    }
}

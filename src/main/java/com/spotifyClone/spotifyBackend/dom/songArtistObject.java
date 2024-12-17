package com.spotifyClone.spotifyBackend.dom;

import org.bson.types.ObjectId;

public class songArtistObject {
    private String artistId;
    private String artistName;
    private ObjectId _id;

    public songArtistObject() {
    }

    public songArtistObject(String artistId, String artistName, ObjectId _id) {
        this.artistId = artistId;
        this.artistName = artistName;
        this._id = _id;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}

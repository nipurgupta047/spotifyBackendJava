package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.artistSongsObject;
import com.spotifyClone.spotifyBackend.dom.songArtistObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("song")
public class song {
    @Id
    private String _id;
    private String songName;
    private ArrayList<songArtistObject> songs;
    private int noOfLikes;
    private String imageUrl;
    private String songUrl;
}

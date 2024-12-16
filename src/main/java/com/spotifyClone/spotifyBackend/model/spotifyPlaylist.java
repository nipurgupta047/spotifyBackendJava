package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.songArtistObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("spotifyPlaylist")
public class spotifyPlaylist {
    @Id
    private String _id;
    private String playlistName;
    private ArrayList<String> songs;
}

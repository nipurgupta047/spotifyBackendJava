package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.songArtistObject;
import com.spotifyClone.spotifyBackend.dom.userHistory;
import com.spotifyClone.spotifyBackend.dom.userLikedSongs;
import com.spotifyClone.spotifyBackend.dom.userPlaylist;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("user")
public class user {
    @Id
    private String _id;
    private String username;
    private String profileName;
    private String password;
    private ArrayList<userPlaylist> playlist;
    private ArrayList<userHistory> history;
    private ArrayList<userLikedSongs> likedSongs;
    private String imageUrl;
}

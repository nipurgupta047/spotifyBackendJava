package com.spotifyClone.spotifyBackend.model;

import com.spotifyClone.spotifyBackend.dom.artistSongsObject;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("artist")
public class artist {
    @Id
    private String _id;
    private String artistName;
    private String imageUrl;
    private ArrayList<artistSongsObject> songs;
}

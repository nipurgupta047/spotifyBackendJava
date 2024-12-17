package com.spotifyClone.spotifyBackend.features.fetch.services;

import com.spotifyClone.spotifyBackend.dom.songArtistObject;
import com.spotifyClone.spotifyBackend.features.fetch.repository.SongRepository;
import com.spotifyClone.spotifyBackend.model.songs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SongFetchService {

    @Autowired
    private SongRepository songRepository;

    public Optional<songs> fetchSongById(@PathVariable String id){
        return songRepository.findById(id);
    }

    public List<songs> fetchSongByArtistId(String id){
        List<songs> fetchedSongs = songRepository.findAll();
        List<songs> artistSongs = new ArrayList<>();
        for(songs ele: fetchedSongs){
            List<songArtistObject> songArtists = ele.getArtist();
            for(songArtistObject ele1:songArtists){
                if(ele1.getArtistId().equals(id)){
                    artistSongs.add(ele);
                    break;
                }
            }
        }
        return artistSongs;
    }

}

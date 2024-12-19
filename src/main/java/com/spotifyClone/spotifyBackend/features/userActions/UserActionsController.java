package com.spotifyClone.spotifyBackend.features.userActions;

import com.spotifyClone.spotifyBackend.dom.userLikedSongs;
import com.spotifyClone.spotifyBackend.dom.userPlaylist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserActionsController {

    @Autowired
    private UserActionsServices userActionsServices;

    @PostMapping("/getPlaylists")
    public List<userPlaylist> getUserPlaylists(@RequestBody UsernameReq req){
        return  userActionsServices.getUserPlaylists(req.getUsername());
    }

    @PostMapping("/likeSong")
    public String likeSong(@RequestBody UsernameSongReq req){
        return  userActionsServices.likeSong(req);
    }

    @PostMapping("/getLikedSongs")
    public List<userLikedSongs> getUserLikedSongs(@RequestBody UsernameReq req){
        return  userActionsServices.getUserLikedSongs(req.getUsername());
    }

    @PostMapping("/removeLikeSong")
    public String removeLikedSong(@RequestBody UsernameSongIdReq req){
        return  userActionsServices.removeLikedSong(req.getUsername(), req.getSongId());
    }

    @PostMapping("/userPlaylist/{id}")
    public userPlaylist getUserPlaylist(@PathVariable String id, @RequestBody TokenReq req){
        return  userActionsServices.getUserPlaylist(id, req.getToken());
    }

}

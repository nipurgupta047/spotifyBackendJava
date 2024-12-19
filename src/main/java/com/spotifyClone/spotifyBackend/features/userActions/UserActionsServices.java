package com.spotifyClone.spotifyBackend.features.userActions;

import com.spotifyClone.spotifyBackend.dom.userLikedSongs;
import com.spotifyClone.spotifyBackend.dom.userPlaylist;
import com.spotifyClone.spotifyBackend.model.users;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserActionsServices {

    @Autowired
    private UserActionsRepository userActionsRepository;
    @Value("${JWT_SECRET_KEY}")
    private String JWT_SECRET_KEY;

    public List<userPlaylist> getUserPlaylists(String username) {
        Optional<users> fetchUser = userActionsRepository.findFirstByUsername(username);
        List<userPlaylist> temp = new ArrayList<>();
        if(fetchUser.isPresent()) {
            return fetchUser.get().getPlaylist();
        }else{
            return temp;
        }
    }

    public List<userLikedSongs> getUserLikedSongs(String username) {
        Optional<users> fetchUser = userActionsRepository.findFirstByUsername(username);
        List<userLikedSongs> temp = new ArrayList<>();
        if(fetchUser.isPresent()) {
            return fetchUser.get().getLikedSongs();
        }else{
            return temp;
        }
    }

    public String removeLikedSong(String username, String songId) {
        Optional<users> fetchUser = userActionsRepository.findFirstByUsername(username);
        if(fetchUser.isPresent()) {
            List<userLikedSongs> newLikedSongs = new ArrayList<>();
            for(int i=0;i<fetchUser.get().getLikedSongs().size(); i++){
                if(!fetchUser.get().getLikedSongs().get(i).getSongId().equals(songId)){
                    newLikedSongs.add(fetchUser.get().getLikedSongs().get(i));
                }
            }
            fetchUser.get().setLikedSongs(newLikedSongs);
            userActionsRepository.save(fetchUser.get());
            return "Removed from library Successfully";

        }else{
            return "No User found";
        }

    }

    public String likeSong(UsernameSongReq req) {

        Optional<users> fetchUser = userActionsRepository.findFirstByUsername(req.getUsername());
        if(fetchUser.isPresent()) {
            List<userLikedSongs> newLikedSongs = fetchUser.get().getLikedSongs();
            newLikedSongs.add(new userLikedSongs(req.getSongId(), req.getSongName(), req.getSongImageUrl()));
            fetchUser.get().setLikedSongs(newLikedSongs);
            userActionsRepository.save(fetchUser.get());
            return "Added to library Successfully";

        }else{
            return "No User found";
        }
    }

    public userPlaylist getUserPlaylist(String id, String token) {
        Map<String, Object> claims = Jwts.parserBuilder()
                .setSigningKey(JWT_SECRET_KEY.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();
        String username =  claims.get("username").toString();
        Optional<users> fetchUser = userActionsRepository.findFirstByUsername(username);
        if(fetchUser.isPresent()) {
            for(int i=0;i<fetchUser.get().getPlaylist().size();i++){
                if(fetchUser.get().getPlaylist().get(i).get_id().equals(id)){
                    return fetchUser.get().getPlaylist().get(i);
                }
            }
        }
        return null;
    }
}

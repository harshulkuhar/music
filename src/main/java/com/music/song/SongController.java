package com.music.song;

import java.util.*;

import com.music.album.Album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**REST Controller */
@RestController
public class SongController {

    //instance of the service. injected
    @Autowired
    private SongService song_service;
    

    //LIST ALL SONGS  [GET REQUEST]
    @GetMapping("/songs")
    public List<Song> getAllSongs(){
        return song_service.getAllSongs();
    }
    //LIST ALL SONGS BELONGING TO AN ALBUM [GET REQUEST]
    @GetMapping("/albums/{albumid}/songs")
    public List<Song> getAllSongsByAlbum(@PathVariable String albumid){

        return song_service.getAllSongsbyAlbum(albumid);
    }

    //RETRIEVE SONG, GIVEN BY ITS ID  [GET REQUEST]
    @GetMapping("/albums/{albumid}/songs/{songid}")
    public Song getSong(@PathVariable String songid){
       return song_service.getSong(songid); 
    }

    //ADD SONG [POST REQUEST] 
    @PostMapping("/albums/{albumid}/songs")
    public void addSong(@RequestBody Song song, @PathVariable String albumid){
        song.setAlbum(new Album(albumid, "")); //create a new album with empty name
        song_service.addSong(song);
    }

    //EDIT OR UPDATE A SONG  [PUT REQUEST]
    @PutMapping("/albums/{albumid}/songs/{songid}")
    public void editSong(@RequestBody Song song, @PathVariable String songid, @PathVariable String albumid){
        song.setAlbum(new Album(albumid, ""));
        song_service.editSong(song);
    }

    //DELETE A SONG  [DELETE REQUEST]
    @DeleteMapping("/albums/{albumid}/songs/{songid}")
    public void deleteSong(@PathVariable String songid){
        song_service.deleteSong(songid);
    }
}

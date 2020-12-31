package com.music.song;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {


    @Autowired
    private SongRepository song_repository;


    public List<Song> getAllSongs(){
        List<Song> songs = new ArrayList<>();
        song_repository.findAll().forEach(songs::add);
        return songs;
    }

    public List<Song> getAllSongsbyAlbum(String albumid){
        return song_repository.findByAlbumAlbumID(albumid);
    }

    public Song getSong(String id){
       return song_repository.findBySongID(id);
    }

    public void addSong(Song song){
        song_repository.save(song);
    }

	public void editSong(Song song) {
        song_repository.save(song);
    }
    
    public void deleteSong(String id){
        song_repository.deleteById(id);
    }
}

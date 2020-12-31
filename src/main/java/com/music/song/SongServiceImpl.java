package com.music.song;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**This is the service class. It implements the methods called by the REST Controller. */
@Service
public class SongServiceImpl implements SongService {


    /**An object instance of the repository. Injected using Autowired. */
    @Autowired
    private SongRepository song_repository;

    /**Returns all the songs stored in the database. It uses the function findAll() 
     * from CrudRepository and using lambra expressions, we add each iterable to
     * the list and return it.
     */
    public List<Song> getAllSongs(){
        List<Song> songs = new ArrayList<>();
        song_repository.findAll().forEach(songs::add);
        return songs;
    }

    /** Returns all songs belonging to a particular album, given its album id.
     * It calls the custom method we defined in the repository.
     */
    public List<Song> getAllSongsbyAlbum(String albumid){
        return song_repository.findByAlbumAlbumID(albumid);
    }

    /**Returns the song object given its id */
    public Song getSong(String id){
       return song_repository.findBySongID(id);
    }

    /**Adds a song to the database */
    public void addSong(Song song){
        song_repository.save(song);
    }

    /**Edits a song in the database.
     * NOTE: Both addSong() and editSong() use the same save() method of CrudRepository.
     * This is because save() works in two ways:
     *              1. If the song object exists in the database, it will be overwritten
     *                  by the one we provide it with.
     *              2. If there is no such song object, then it will create one on
     *                  its own.
     */
	public void editSong(Song song) {
        song_repository.save(song);
    }
    
    /** Delete a song from the database. */
    public void deleteSong(String id){
        song_repository.deleteById(id);
    }
}

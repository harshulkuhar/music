package com.music.song;
import java.util.*;

import org.springframework.data.repository.CrudRepository;

/**Repository class */
public interface SongRepository extends CrudRepository<Song, String>{
    
    /**Custom method created that returns the Song object given its id.
     * NOTE: there already exists a method in CrudRepository named
     * findById() but it returns the object Optional<Song> instead of 
     * Song.
     */
    public Song findBySongID(String songID);

    /**Custom method created that returns all the songs sharing the given album id. */
    public List<Song> findByAlbumAlbumID(String albumid);
}

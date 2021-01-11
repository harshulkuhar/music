package com.music.repository;

import java.util.*;

import com.music.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**Repository class */
@Repository
public interface SongRepository extends JpaRepository<Song, String>{
    
    /**Custom method created that returns the Song object given its id.
     * NOTE: there already exists a method in CrudRepository named
     * findById() but it returns the object Optional<Song> instead of 
     * Song.
     */
    public Song findBySongID(String songID);

    /**Custom method created that returns all the songs sharing the given album id. */
    public List<Song> findByAlbumAlbumID(String albumid);
}

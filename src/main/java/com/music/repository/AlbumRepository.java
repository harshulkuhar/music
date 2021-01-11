package com.music.repository;

import com.music.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**This is the repository class. */
@Repository
public interface AlbumRepository extends JpaRepository<Album, String>{
    
    /**Returns the Album by the given id.
     * NOTE: there exists a function findById() but it returns Optional<Album>
     * instead of Album.
    */
    public Album findByAlbumID(String albumID);
}

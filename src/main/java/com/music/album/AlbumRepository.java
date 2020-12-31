package com.music.album;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**This is the repository class. */
@Repository
public interface AlbumRepository extends CrudRepository<Album, String>{
    
    /**Returns the Album by the given id.
     * NOTE: there exists a function findById() but it returns Optional<Album>
     * instead of Album.
    */
    public Album findByAlbumID(String albumID);
}

package com.music.album;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album, String>{
    
    public Album findByAlbumID(String albumID);
}

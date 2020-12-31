package com.music.album;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**This is the service class. Here the controller methods are implemented. */
@Service
public class AlbumServiceImpl implements AlbumService{
    

    /**an instance of AlbumRepository, that is injected using Autowired. */
    @Autowired
    private AlbumRepository album_repository;

    /**uses lambda expressions to iterate through the iterable that we get from findAll()
     * and adding each to the list of albums.
     * Returns a list of Albums in the database.
     */
    public List<Album> getAllAlbums(){
        List<Album> albums = new ArrayList<>();
        album_repository.findAll().forEach(albums::add);
        return albums;
    }

    /**calling the method we made in the repository class.
     * Returns an Album object given its id.
    */
    public Album getAlbum(String id){
       return album_repository.findByAlbumID(id);
    }
    /**pre-defined method from CrudRepository. Adds an Album to the database.*/
    public void addAlbum(Album album){
        album_repository.save(album);
    }
    /** Updates an Album.
     * NOTE: both addAlbum() and editAlbum() use the same CrudRepository method save().
     * This method works in two ways : it will check whether the album object we have given it exists in the database,
     * and if it doesnt exist, will add it. If it exists, it will be overwritten by the object that we have.
     */
	public void editAlbum(Album album) {
        album_repository.save(album);
    }
    /** Deletes the album from the database given its id. */
    public void deleteAlbum(String id){
        album_repository.deleteById(id);
    }
}

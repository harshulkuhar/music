package com.music.album;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**This is the REST Controller. */
@RestController
public class AlbumController {
    
    /**An object instance of the service that will implement the methods.
     * Dependency injection done using autowired.
     */
    @Autowired
    private AlbumService album_service;
    
    //GET ALL ALBUMS  [GET REQUEST]
    @GetMapping("/albums")
    public List<Album> getAlbums(){

        return album_service.getAllAlbums();
    }

    //GET A PARTICULAR ALBUM  [GET REQUEST]
    @GetMapping("/albums/{albumid}")
    public Album getAlbum(@PathVariable String albumid){
       return album_service.getAlbum(albumid); 
    }

    //ADD AN ALBUM TO THE DATABASE  [POST REQUEST]
    @PostMapping("/albums")
    public void addAlbum(@RequestBody Album album){
        album_service.addAlbum(album);
    }

    //UPDATE AN ALBUM  [PUT REQUEST]
    @PutMapping("/albums/{albumid}")
    public void editAlbum(@RequestBody Album album, @PathVariable String albumid){
        album_service.editAlbum(album);
    }

    //DELETE AN ALBUM FROM THE DATABASE [DELETE REQUEST]
    @DeleteMapping("/albums/{albumid}")
    public void deleteAlbum(@PathVariable String albumid){
        album_service.deleteAlbum(albumid);
    }
}

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

@RestController
public class AlbumController {
    
    @Autowired
    private AlbumService album_service;
    
    @GetMapping("/albums")
    public List<Album> getAlbums(){

        return album_service.getAllAlbums();
    }

    @GetMapping("/albums/{albumid}")
    public Album getAlbum(@PathVariable String albumid){
       return album_service.getAlbum(albumid); 
    }

    @PostMapping("/albums")
    public void addAlbum(@RequestBody Album album){
        album_service.addAlbum(album);
    }

    @PutMapping("/albums/{albumid}")
    public void editAlbum(@RequestBody Album album, @PathVariable String albumid){
        album_service.editAlbum(album);
    }

    @DeleteMapping("/albums/{albumid}")
    public void deleteAlbum(@PathVariable String albumid){
        album_service.deleteAlbum(albumid);
    }
}

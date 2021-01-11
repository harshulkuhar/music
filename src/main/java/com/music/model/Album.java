package com.music.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**This is the Entity class. */
@Entity
@Table(name="album")
public class Album {
    
    /**Primary key is albumID which is mapped to album_id column in the database. */
    @Id
    @GeneratedValue
    private String albumID;

    private String albumName;

    /**Constructors, getters and setters */
    public Album(){

    }

    public Album(String albumID, String albumName) {
        this.albumID = albumID;
        this.albumName = albumName;
    }
    

    public String getAlbumID() {
        return albumID;
    }

    public void setAlbumID(String albumID) {
        this.albumID = albumID;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    
}

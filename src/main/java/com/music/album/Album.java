package com.music.album;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="albums")
public class Album {
    
    @Id
    @Column(name = "album_id")
    private String albumID;

    @Column(name = "album_name")
    private String albumName;

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

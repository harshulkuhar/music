package com.music.song;

import com.music.album.Album;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="songs")
public class Song {
    
    @Id
    @Column(name = "song_id")
    private String songID;

    @Column(name = "song_name")
    private String songName;

    @ManyToOne
    private Album album;


    public Song(){
        
    }
    
    public Song(String songID, String songName, String albumid) {
        this.songID = songID;
        this.songName = songName;
        this.album = new Album(albumid, "");
    }


    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}

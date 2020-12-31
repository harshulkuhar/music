package com.music.song;

import com.music.album.Album;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**This is the Entity class Song. It has a songID which is a primary key mapped 
 * to the column song_id in the databse; and a songName which is mapped to song_name */
@Entity
@Table(name="songs")
public class Song {
    
    @Id
    @Column(name = "song_id")
    private String songID;

    @Column(name = "song_name")
    private String songName;

    /** Created a many-to-one relationship with Album object, since multiple songs
     * can be linked to one album. This column will store the Album the song is referencing.
     */
    @ManyToOne
    private Album album;


    /**Constructors, getters and setters */
    public Song(){
        
    }
    
    public Song(String songID, String songName, String albumid) {
        this.songID = songID;
        this.songName = songName;
        this.album = new Album(albumid, ""); //given the album id, it creates an album with the id, but with an empty name.
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

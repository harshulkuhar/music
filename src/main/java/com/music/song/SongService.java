package com.music.song;

import java.util.*;
public interface SongService {
    
    /**Returns all songs stored in the database. */
    public List<Song> getAllSongs();

    /**Returns all songs belonging to a particular album */
    public List<Song> getAllSongsbyAlbum(String albumid);

    /**Get a Song object given its id */
    public Song getSong(String id);

    /** Add a song to the database. */
    public void addSong(Song song);

    /**Edit or update a song. */
    public void editSong(Song song);

    /**Delete a song from the database. */
    public void deleteSong(String id);
}

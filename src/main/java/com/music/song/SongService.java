package com.music.song;

import java.util.*;
public interface SongService {
    
    /**Returns all songs stored in the database. */
    public List<Song> getAllSongs();

    /**Returns all songs belonging to a particular album */
    public List<Song> getAllSongsbyAlbum(String albumid);

    public Song getSong(String id);

    public void addSong(Song song);

    public void editSong(Song song);

    public void deleteSong(String id);
}

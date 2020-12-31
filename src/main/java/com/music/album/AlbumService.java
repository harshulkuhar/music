package com.music.album;

import java.util.*;

public interface AlbumService {
    
    /**Returns the list of all albums */
    public List<Album> getAllAlbums();

    /** Returns an Album object with the id provided */
    public Album getAlbum(String id);

    /**Add an album to the database. */
    public void addAlbum(Album album);

    /**Edit or update an album */
    public void editAlbum(Album album);

    /**Delete an album from the database */
    public void deleteAlbum(String id);
}

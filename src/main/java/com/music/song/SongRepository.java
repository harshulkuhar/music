package com.music.song;
import java.util.*;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, String>{
    
    public Song findBySongID(String songID);

    public List<Song> findByAlbumAlbumID(String albumid);
}

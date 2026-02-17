package model;

import java.util.*;

public class Playlist {

    private String playlistId;
    private String name;
    private User createdBy;
    private List<Song> songs = new ArrayList<>();

    public Playlist(String playlistId, String name, User createdBy) {
        this.playlistId = playlistId;
        this.name = name;
        this.createdBy = createdBy;
    }

    // ✅ ADD THIS METHOD
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added to playlist: " + song.getTitle());
    }

    public String getName() {
        return name;
    }
}

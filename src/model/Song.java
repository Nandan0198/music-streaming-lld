package model;

public class Song {
    private String songId;
    private String title;
    private Artist artist;
    private String genre;
    private int duration;
    private int playCount = 0;

    public Song(String songId, String title, Artist artist, String genre, int duration) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public void incrementPlayCount() {
        playCount++;
    }

    public String getTitle() { return title; }
    public int getDuration() { return duration; }
}

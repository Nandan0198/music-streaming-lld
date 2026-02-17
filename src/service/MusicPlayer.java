package service;

import model.Song;
import observer.PlayerObserver;

import java.util.*;

public class MusicPlayer {

    private static MusicPlayer instance;
    private Song currentSong;
    private boolean isPlaying;
    private Queue<Song> queue = new LinkedList<>();
    private List<PlayerObserver> observers = new ArrayList<>();

    private MusicPlayer() {}

    public static synchronized MusicPlayer getInstance() {
        if (instance == null) {
            instance = new MusicPlayer();
        }
        return instance;
    }

    public void play(Song song) {
        currentSong = song;
        isPlaying = true;
        song.incrementPlayCount();
        notifyObservers("Now Playing: " + song.getTitle());
    }

    public void addToQueue(Song song) {
        queue.add(song);
    }

    public void addObserver(PlayerObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (PlayerObserver obs : observers) {
            obs.update(message);
        }
    }
}

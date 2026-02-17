package model;

import java.util.*;

public class Artist {

    private String artistId;
    private String name;
    private String genre;
    private List<User> followers = new ArrayList<>();

    // ✅ ADD THIS CONSTRUCTOR
    public Artist(String artistId, String name, String genre) {
        this.artistId = artistId;
        this.name = name;
        this.genre = genre;
    }

    public void addFollower(User user) {
        followers.add(user);
    }

    public String getName() {
        return name;
    }
}

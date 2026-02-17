package model;

import java.util.*;

public class User {
    private String userId;
    private String name;
    private String email;
    private List<Artist> followedArtists = new ArrayList<>();

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public void followArtist(Artist artist) {
        if (!followedArtists.contains(artist)) {
            followedArtists.add(artist);
            artist.addFollower(this);
        }
    }

    public String getName() { return name; }
}

package service;

import model.Song;
import model.User;
import strategy.*;

import java.util.*;

public class RecommendationService {

    private RecommendationStrategy strategy;

    public void setStrategy(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Song> getRecommendations(User user) {
        if (strategy == null) {
            strategy = new GenreBasedStrategy();
        }
        return strategy.recommendSongs(user);
    }
}

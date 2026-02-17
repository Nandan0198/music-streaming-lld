import model.*;
import service.*;
import factory.*;
import observer.*;
import strategy.*;

public class Main {

    public static void main(String[] args) {

        User user = new User("U1", "Alice", "alice@email.com");
        Artist artist = new Artist("A1", "Taylor Swift", "Pop");

        Song song1 = new Song("S1", "Love Story", artist, "Pop", 230);

        MusicPlayer player = MusicPlayer.getInstance();

        player.addObserver(new UserNotificationObserver(user));

        player.play(song1);

        PlaylistFactory factory = new UserPlaylistFactory();
        Playlist playlist = factory.createPlaylist("Workout Mix", user);

        playlist.addSong(song1);

        RecommendationService service = new RecommendationService();
        service.setStrategy(new GenreBasedStrategy());

        service.getRecommendations(user);

        System.out.println("Program executed successfully ");
    }
}

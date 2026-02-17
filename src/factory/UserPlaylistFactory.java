package factory;

import model.Playlist;
import model.User;

import java.util.UUID;

public class UserPlaylistFactory implements PlaylistFactory {

    @Override
    public Playlist createPlaylist(String name, User user) {
        return new Playlist("PL-" + UUID.randomUUID(), name, user);
    }
}

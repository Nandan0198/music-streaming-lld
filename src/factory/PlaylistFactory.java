package factory;

import model.Playlist;
import model.User;

public interface PlaylistFactory {
    Playlist createPlaylist(String name, User user);
}

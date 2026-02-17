package observer;

import model.User;

public class UserNotificationObserver implements PlayerObserver {

    private User user;

    public UserNotificationObserver(User user) {
        this.user = user;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + user.getName() + ": " + message);
    }
}

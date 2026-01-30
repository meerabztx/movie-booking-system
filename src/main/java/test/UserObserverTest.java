package test;

import user.services.UserService;
import observer.NotificationObserver;

public class UserObserverTest {

    public static void main(String[] args) {

        UserService userService = new UserService();

        // Attach observer
        userService.addObserver(new NotificationObserver());

        // Register user (this should trigger observer)
        userService.registerUser(
            "03123456789",
            "observer@test.com",
            "Observer User",
            "pass123"
        );
    }
}

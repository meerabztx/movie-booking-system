import user.services.UserService;

public class TestUser {
    public static void main(String[] args) {
        UserService service = new UserService();

        // Hardcoded test user
        service.registerUser("03001234567", "hamna@gmail.com", "Hamna", "pass123");

        System.out.println("User registered!");
    }
}

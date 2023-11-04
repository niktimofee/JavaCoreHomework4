package Task1;

public class Main {
    public static void main(String[] args) {
        String login = "user123";
        String password = "password123";
        String confirmPassword = "password123";

        UserRegistration registration = new UserRegistration();

        try {
            if (registration.checkLoginAndPassword(login, password, confirmPassword)) {
                System.out.println("Registration successful");
            }
        } catch (WrongLoginException e) {
            System.err.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.err.println(e.getMessage());
        }
    }
}
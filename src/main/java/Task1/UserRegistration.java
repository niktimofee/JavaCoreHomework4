package Task1;

public class UserRegistration {
    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Login length should be less than 20 characters");
        }
        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password is invalid");
        }
        return true;
    }
}
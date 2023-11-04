package Task1;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Wrong login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
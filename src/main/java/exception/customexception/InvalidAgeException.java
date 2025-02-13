package exception.customexception;

// Compile Time Exception / Checked Exception
public class InvalidAgeException extends Exception {

    // Default constructor
    public InvalidAgeException() {
        super("Invalid age provided");
    }

    // Constructor with a custom message
    public InvalidAgeException(String message) {
        super(message);
    }

    // Constructor with a custom message and cause
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

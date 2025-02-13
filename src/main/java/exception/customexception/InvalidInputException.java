package exception.customexception;

// Runtime Exception / Unchecked Exception
public class InvalidInputException extends RuntimeException {

    // default constructor
    public InvalidInputException() {
    }

    // constructor with a custom message
    public InvalidInputException(String message) {
        super(message);
    }

    // constructor with a custom message and cause
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}

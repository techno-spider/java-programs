package exception.customexception;

public class UncheckedExceptionTest {

    // method that throws the custom runtime exception
    public static void validInput(String input) {
        if (input == null || input.isBlank()) {
            throw new InvalidInputException("Input cannot be null or empty");
        }
    }

    public static void main(String[] args) {
        try {
            validInput("");
        } catch (InvalidInputException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

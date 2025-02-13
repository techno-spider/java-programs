package exception.customexception;

public class CheckedExceptionTest {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 60)
            throw new InvalidAgeException("Age must be in between 18 and 60. Provided: " + age);
    }

    public static void main(String[] args) {
        try {
            Tester.test(); // execute every time
            checkAge(15); // this will throw the exception
            Tester.verify(); // not execute if exception thrown
        } catch (InvalidAgeException e) {
            // handle the exception
            System.out.println("Caught Exception: " + e.getMessage());
            System.exit(1);
        } finally {
            /*finally block will always execute, except when exception is thrown and system.exit is called in catch
            block */
            /* It will execute if exception is not caught, and will not execute if exception caught, because we have
            system.exit in catch block */
            System.out.println("Finally block executed");
        }
    }
}

/*
 * output:
 * Test method from Tester class
 * Caught Exception: Age must be in between 18 and 60. Provided: 15
 */

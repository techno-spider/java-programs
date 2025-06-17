package exception;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int result = 10 / 0; // this will throw arithmetic exception
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: can not divide by zero.");
        } catch (Exception ex) {
            System.out.println("Exception caught: An unexpected error occurred: " + ex.getMessage());
        } finally {
            System.out.println("finally block executed.");
        }
    }
}

/*
output:
ArithmeticException caught: can not divide by zero.
finally block executed.
*/
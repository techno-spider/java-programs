package popular;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10; // find the 10th fibonacci number
        System.out.println("The " + n + "th fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

/*
 * output:
 * The 10th fibonacci number is: 55
 */
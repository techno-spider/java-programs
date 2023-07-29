package numbers;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 9;
        System.out.println("The " + n + "th Fibonacci number is " + nthFibonacci(n));

        fibonacciSequence(n);
    }

    static int nthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("'n' must be a positive integer");
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    static void fibonacciSequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(nthFibonacci(i));
        }
    }
}

package popular;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10;
        System.out.println("The " + n + " fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        int first = 0, second = 1;

        if (n == 0) {
            System.out.println("The Fibonacci series up to the " + n + " number is: ");
            System.out.println(first);
            return first;
        }

        if (n == 1) {
            System.out.println("The Fibonacci series up to the " + n + " number is: ");
            System.out.println(first + ", " + second);
            return second;
        }

        System.out.println("The Fibonacci series up to the " + n + " number is: ");
        System.out.print(first + ", " + second);

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println(); // Move to the next line after printing the series

        return second;
    }
}

/*
 * output:
 * The Fibonacci series up to the 10 number is:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 * The 10 fibonacci number is: 55
 */
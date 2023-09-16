package popular;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 9;
        System.out.println("The " + n + "th fibonacci number is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("The Fibonacci series up to the " + n + "th number is: ");

        if (n == 0) {
            System.out.println(first);
            return first;
        }

        System.out.print(first + " ");

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
 * The Fibonacci series up to the 9th number is: 0 , 1, 2, 3, 5, 8, 13, 21, 34
 * The 9th fibonacci number is: 34
 */
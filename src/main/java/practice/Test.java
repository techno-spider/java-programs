package practice;

public class Test {

    public static void main(String[] args) {

        int n = 8;
        System.out.println("The " + n + " th fibonacci number is: " + fibonacci(n));
    }

    private static int fibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("The Fibonacci series up to " + n + " th number is: ");

        if (n == 0) {
            System.out.println(first);
            return first;
        }

        System.out.print(first);

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
        return second;
    }
}
package popular;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(findFactorial(5));
        System.out.println(getFactorial(5));
    }

    // using recursion
    static long findFactorial(long num) {
        if (num <= 1)
            return 1;
        else
            return num * findFactorial(num - 1);
    }

    // using for-loop
    static int getFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

/*
 * output:
 * 120
 * 120
 */

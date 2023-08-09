package popular;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(getFactorial(7));
        System.out.println(getFactorial(3));

        System.out.println(findFactorial(5));
    }

    static int getFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // using recursion
    static long findFactorial(long num) {
        if (num == 1)
            return 1;
        else
            return (num * findFactorial(num - 1));
    }
}

/*
 * output:
 * 5040
 * 6
 */

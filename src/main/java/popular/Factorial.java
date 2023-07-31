package popular;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(getFactorial(7));
        System.out.println(getFactorial(3));
    }

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
 * 5040
 * 6
 */

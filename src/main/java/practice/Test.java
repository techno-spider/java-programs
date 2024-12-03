package practice;

import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        String str = "algo maverick";

        str.chars()
           .filter(ch -> ch != ' ' && ch != ',')
           .map(Character::toLowerCase)
           .mapToObj(i -> (char) i)
           .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
           .forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println(factorial(5));
        System.out.println(getFactorial(5));
    }

    public static long factorial(long num) {
        if (num <= 1)
            return 1;
        return (num * factorial(num - 1));
    }

    static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

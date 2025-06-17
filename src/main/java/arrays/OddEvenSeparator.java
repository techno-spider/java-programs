package arrays;

import java.util.Arrays;

public class OddEvenSeparator {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 7, 2, 8, 5};

        int[] odd = Arrays.stream(arr)
                          .filter(n -> n % 2 == 0)
                          .toArray();
        System.out.println("Odd: " + Arrays.toString(odd));

        int[] even = Arrays.stream(arr)
                           .filter(n -> n % 2 != 0)
                           .toArray();
        System.out.println("Even: " + Arrays.toString(even));
    }
}

package stream;

import java.util.Arrays;

public class MultiplyArray {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5 };

        int multiply = Arrays.stream(arr)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Result: " + multiply);
    }
}

/*
 * output:
 * Result: 120
 */
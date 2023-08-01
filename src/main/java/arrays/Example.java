package arrays;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1 };

        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);
    }
}

/*
 * output:
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 */
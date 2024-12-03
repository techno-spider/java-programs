package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 0 };
        int[] arr2 = { 6, 7, 8, 9, 0 };
        System.out.println("Reverse Array method: " +
                Arrays.toString(reverseArray(arr1)));
        System.out.println("Reverse Arr method: " +
                Arrays.toString(reverseArr(arr2)));
    }

    // Approach 1
    private static int[] reverseArray(int[] arr) {
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
    }

    // Approach 2
    private static int[] reverseArr(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

/*
 * output:
 * Reverse Array method: [0, 5, 4, 3, 2, 1]
 * Reverse Arr method: [9, 8, 7, 6, 0]
 */
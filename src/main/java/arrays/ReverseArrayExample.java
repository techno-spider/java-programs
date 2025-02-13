package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 0};
        int[] arr2 = {6, 7, 8, 9, 0};
        System.out.println("Reverse Array method: " + Arrays.toString(reverseArray(arr1)));
        System.out.println("Reverse Arr method: " + Arrays.toString(reverseArr(arr2)));
    }

    // Approach 1
    private static int[] reverseArray(int[] arr) {
        return IntStream.range(0, arr.length)
                        .map(i -> arr[arr.length - 1 - i])
                        .toArray();
    }

    // Approach 2
    public static int[] reverseArr(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        return arr;
    }
}

/*
 * output:
 * Reverse Array method: [0, 5, 4, 3, 2, 1]
 * Reverse Arr method: [9, 8, 7, 6, 0]
 */
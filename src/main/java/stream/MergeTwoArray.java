package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 5, 6, 7, 8 };

        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).forEach(num -> System.out.print(num + " "));

        // for (int num : mergedArray) {
        // System.out.print(num + " ");
        // }
    }
}

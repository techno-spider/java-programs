package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoArraysMerge {
    public static void main(String[] args) {

        int[] arr1 = { 7, 1, 6 };
        int[] arr2 = { 9, 5, 0 };

        int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .toArray();
        System.out.println(Arrays.toString(mergedArray));
    }
}

/*
 * output:
 * [7, 1, 6, 9, 5, 0]
 */
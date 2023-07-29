package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    /*private static int[] reverseArray(int[] arr) {
        return Arrays.stream(arr)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(b, a))
                     .mapToInt(Integer::intValue)
                     .toArray();
    }*/

    private static int[] reverseArray(int[] arr) {
        return IntStream.range(0, arr.length)
                        .map(i -> arr[arr.length - 1 - i])
                        .toArray();
    }

}

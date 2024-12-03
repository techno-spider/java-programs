package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedArray {

    public static void main(String[] args) {

        int[] numbers = { 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1 };

        // Approach 1
        int[] sortedNumber = IntStream.of(numbers)
                .boxed()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(sortedNumber));

        // Approach 2
        int[] sortedArr = IntStream.of(numbers)
                .boxed()
                .collect(Collectors.partitioningBy(num -> num == 1))
                .values()
                .stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(sortedArr));
    }
}

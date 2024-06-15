package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNumber {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(10, 21, 16, 33, 58, 23, 39, 27, 37, 45, 31);

        System.out.println("\nSorted in natural order:");
        numList.stream()
                .sorted()
                .forEach(num -> System.out.print(num + " "));

        System.out.println("\nSorted in reversed order:");
        numList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(num -> System.out.print(num + " "));
    }
}

/*
 * output:
 * Sorted in natural order:
 * 10 16 21 23 27 31 33 37 39 45 58
 * Sorted in reverse order:
 * 58 45 39 37 33 31 27 23 21 16 10
 */
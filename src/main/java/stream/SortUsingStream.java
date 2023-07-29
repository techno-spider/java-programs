package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingStream {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(10, 21, 16, 37, 58, 23, 39, 27, 37, 16, 58);

        System.out.println("Sorted in reversed order:");
        numList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(num -> System.out.print(num + ", "));
        System.out.println("\nSorted in natural order:");
        numList.stream()
                .sorted()
                .forEach(num -> System.out.print(num + ", "));

    }
}

package practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {

        List<Integer> numList = List.of(14, 30, 55, 21, 29, 14, 39, 21, 39, 26, 32);

        Set<Integer> set = new HashSet<>();

        numList.stream()
                .filter(num -> !set.add(num))
                .forEach(System.out::println);

        int factorial = IntStream.rangeClosed(1, 7)
                .parallel()
                .reduce((a, b) -> a * b)
                .getAsInt();
        System.out.println(factorial);
    }
}
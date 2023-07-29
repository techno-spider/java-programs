package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetDuplicates {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 21, 16, 37, 58, 23, 39, 27, 37, 16, 58);

        Set<Integer> set = new HashSet<>();

        numbers.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);
    }
}

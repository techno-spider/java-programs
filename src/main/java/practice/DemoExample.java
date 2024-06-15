package practice;

import java.util.Arrays;
import java.util.List;

public class DemoExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(19, 19, 27, 19, 42, 42, 50, 95, 95, 31, 16, 79, 50, 31);

        List<Integer> result = numbers.stream()
                .distinct()
                .toList();

        System.out.println(result);

    }
}
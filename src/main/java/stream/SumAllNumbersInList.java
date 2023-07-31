package stream;

import java.util.Arrays;
import java.util.List;

public class SumAllNumbersInList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(69, 83, 51, 77);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum is: " + sum);
    }
}

/*
 * output:
 * Sum is: 280
 */
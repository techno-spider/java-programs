package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MaxMinValue {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(27, 19, 42, 95, 16, 79, 50, 31);

        int maxNum = numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Maximum number is: " + maxNum);

        int minNum = numbers.stream()
                .min(Integer::compare)
                .get();
        System.out.println("Minimum number is: " + minNum);
    }
}

/*
 * output:
 * Maximum number is: 95
 * Minimum number is: 16
 */
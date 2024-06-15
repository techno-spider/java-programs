package stream;

import java.util.Arrays;
import java.util.List;

public class StartsWithNumber {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(27, 590, 9, 57, 14, 17, 20, 11, 5, 23);

        // Approach 1:
        List<Integer> result1 = numList.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .map(Integer::valueOf)
                .toList();

        System.out.println("Numbers starts with 1: " + result1);

        // Approach 2:
        List<Integer> result2 = numList.stream()
                .filter(num -> String.valueOf(num)
                        .startsWith("5"))
                .toList();
        System.out.println("Numbers starts with 5: " + result2);
    }
}

/*
 * output:
 * Numbers starts with 1: [14 , 17 , 11 ]
 * Numbers starts with 5: [590 , 57 , 5 ]
 */
package stream;

import java.util.Arrays;
import java.util.List;

public class StartsWithNumber {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(27, 9, 14, 17, 20, 11, 5, 23);

        List<String> result = numList.stream()
                .map(s -> s + " ")
                .filter(s -> s.startsWith("1"))
                .toList();

        System.out.println("Numbers starts with 1: " + result);
    }
}

/*
 * output:
 * Numbers starts with 1: [14 , 17 , 11 ]
 */
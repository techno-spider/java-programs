package stream;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(25, 17, 94, 50, 11, 36, 15, 30);

        List<Integer> result = numList.stream()
                                      .filter(num -> String.valueOf(num)
                                                           .startsWith("3"))
                                      .toList();
        System.out.println(result);

    }
}

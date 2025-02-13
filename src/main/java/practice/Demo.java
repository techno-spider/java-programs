package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        String str = "coconut";

        // count of character
        Map<String, Long> collect = Arrays.stream(str.split(""))
                                          .sorted(Comparator.reverseOrder())
                                          .collect(Collectors.groupingBy(Function.identity(),
                                                                         LinkedHashMap::new,
                                                                         Collectors.counting()));
        //System.out.println(collect);

        // find duplicate elements
        List<Map.Entry<String, Long>> list = Arrays.stream(str.split(""))
                                                   .collect(Collectors.groupingBy(Function.identity(),
                                                                                  Collectors.counting()))
                                                   .entrySet()
                                                   .stream()
                                                   .filter(x -> x.getValue() > 1L)
                                                   .toList();
        //System.out.println(list);

        // first non-repeated character
        Character firstNonRepeatedChar = str.chars()
                                            .mapToObj(s -> Character.toLowerCase((char) s))
                                            .collect(Collectors.groupingBy(Function.identity(),
                                                                           LinkedHashMap::new,
                                                                           Collectors.counting()))
                                            .entrySet()
                                            .stream()
                                            .filter(e -> e.getValue() == 1L)
                                            .map(Map.Entry::getKey)
                                            .findFirst()
                                            .orElseThrow();
        System.out.println(firstNonRepeatedChar);
    }
}
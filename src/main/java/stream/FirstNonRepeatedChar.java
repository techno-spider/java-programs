package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        Character result = str.chars()
                              .mapToObj(s -> Character.toLowerCase((char) s))
                              .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                                                             Collectors.counting()))
                              .entrySet()
                              .stream()
                              .filter(entry -> entry.getValue() == 1L)
                              .map(Map.Entry::getKey)
                              .findFirst()
                              .orElseThrow();

        System.out.println(result);
    }
}

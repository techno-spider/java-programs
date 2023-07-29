package programs;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        String str = "aabbcdadffecedba";

        System.out.println("The first non-repeated character is: " + findFirstNonRepeatedChar(str));
    }

    public static Optional<Character> findFirstNonRepeatedChar(String str) {

        return Optional.of(str.chars()
                              .mapToObj(ch -> (char) ch)
                              .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                                                             Collectors.counting()))
                              .entrySet()
                              .stream()
                              .filter(entry -> entry.getValue() == 1)
                              .map(Map.Entry::getKey)
                              .findFirst()
                              .orElse('0'));
    }
}

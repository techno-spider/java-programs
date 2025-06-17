package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {

        String str = "specification";

        Character result = str.chars()
                              .mapToObj(s -> Character.toLowerCase((char) s))
                              .collect(Collectors.groupingBy(Function.identity(),
                                                             LinkedHashMap::new,
                                                             Collectors.counting()))
                              .entrySet()
                              .stream()
                              .filter(entry -> entry.getValue() > 1L)
                              .map(Map.Entry::getKey)
                              .findFirst()
                              .orElseThrow();

        System.out.println("First Repeated Character: " + result);
    }
}

/*
 * output:
 * First Repeated Character: c
 */
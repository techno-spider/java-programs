package stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyDescending {
    public static void main(String[] args) {

        String str = "banana";

        // sorted by key ascending order
        System.out.println("sorted by key descending order");
        LinkedHashMap<Character, Long> keyDesc = str.chars()
                                                    .filter(ch -> ch != ' ' && ch != ',')
                                                    .mapToObj(ch -> (char) ch)
                                                    .sorted(Comparator.reverseOrder())
                                                    .collect(Collectors.groupingBy(Function.identity(),
                                                                                   LinkedHashMap::new,
                                                                                   Collectors.counting()));
        System.out.println(keyDesc);

        // sorted by value descending order
        System.out.println("sorted by value descending order");
        LinkedHashMap<Character, Long> valueDesc = str.chars()
                                                      .filter(ch -> ch != ' ' && ch != ',')
                                                      .mapToObj(ch -> (char) ch)
                                                      .collect(Collectors.groupingBy(Function.identity(),
                                                                                     Collectors.counting()))
                                                      .entrySet()
                                                      .stream()
                                                      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                                      .collect(Collectors.toMap(Map.Entry::getKey,
                                                                                Map.Entry::getValue,
                                                                                (oldValue, newValue) -> oldValue,
                                                                                LinkedHashMap::new));
        System.out.println(valueDesc);
    }
}

/*
 * output:
 * The frequency of occurrence of 'a' is: 3
 * The frequency of occurrence of 'n' is: 2
 * The frequency of occurrence of 'b' is: 1
 */
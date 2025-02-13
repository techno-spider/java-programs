package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyAscending {
    public static void main(String[] args) {

        // sorted by key ascending order
        System.out.println("sorted by key ascending order");
        String str = "banana";

        Map<Character, Long> keyAsc = str.chars()
                                         .mapToObj(ch -> (char) ch)
                                         .sorted()
                                         .collect(Collectors.groupingBy(Function.identity(),
                                                                        LinkedHashMap::new,
                                                                        Collectors.counting()));
        System.out.println(keyAsc);
        //charCountAsc.forEach((character, count) -> System.out.println(character + " : " + count));

        // sorted by value ascending order
        System.out.println("sorted by value ascending order");

        LinkedHashMap<Character, Long> valueAsc = str.chars()
                                                     .filter(ch -> ch != ' ' && ch != ',')
                                                     .mapToObj(ch -> (char) ch)
                                                     .collect(Collectors.groupingBy(Function.identity(),
                                                                                    Collectors.counting()))
                                                     .entrySet()
                                                     .stream()
                                                     .sorted(Entry.comparingByValue())
                                                     .collect(Collectors.toMap(Entry::getKey,
                                                                               Entry::getValue,
                                                                               (oldValue, newValue) -> oldValue,
                                                                               LinkedHashMap::new));
        System.out.println(valueAsc);
    }
}
/*
 * output:
 * sorted by key ascending order
 * {a=3, b=1, n=2}
 * sorted by value ascending order
 * [b=1, n=2, a=3]
 */
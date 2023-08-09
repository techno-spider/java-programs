package stream;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyDescending {
        public static void main(String[] args) {

                String str = "banana";

                Map<Character, Long> frequencyMap = str.chars()
                                .mapToObj(ch -> (char) ch)
                                .collect(Collectors.groupingBy(Function.identity(),
                                                Collectors.counting()));
                frequencyMap.entrySet()
                                .stream()
                                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                .forEach(entry -> System.out.println(
                                                "The frequency of occurrence of '" + entry.getKey() + "' is: "
                                                                + entry.getValue()));
        }
}

/*
 * output:
 * The frequency of occurrence of 'a' is: 3
 * The frequency of occurrence of 'n' is: 2
 * The frequency of occurrence of 'b' is: 1
 */
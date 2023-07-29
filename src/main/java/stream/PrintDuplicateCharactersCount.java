package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateCharactersCount {
    public static void main(String[] args) {

        String str = "Java jakarta";

        str = str.toLowerCase();

        // Convert the string to lowercase for case-insensitive comparison

        Map<Character, Long> charCountMap = str.chars()
                .mapToObj((c) -> (char) c)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));
    }
}

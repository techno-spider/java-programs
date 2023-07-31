package stream;

import java.util.stream.Collectors;

public class PrintDuplicateCharactersCount {
    public static void main(String[] args) {

        String str = "Java jakarta";
        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        str.chars()
                .mapToObj((c) -> (char) c)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));
    }
}

/*
 * output:
 * Character: a, Count: 5
 * Character: j, Count: 2
 */
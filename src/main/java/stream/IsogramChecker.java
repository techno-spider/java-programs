package stream;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {

    public static void main(String[] args) {

        String input = "spring";

        boolean isIsogram = isIsogram(input);
        System.out.printf(String.format("Is the word '%s' is an isogram: %s", input, isIsogram));
    }

    private static boolean isIsogram(String input) {
        Set<Character> set = new HashSet<>();
        return input.chars()
                    .mapToObj(c -> Character.toLowerCase((char) c))
                    .filter(Character::isLetter)
                    .allMatch(set::add);
    }
}

/*
 * output:
 * Is the word 'spring' is an isogram: true
 */
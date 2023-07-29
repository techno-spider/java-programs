package strings;

import java.util.HashSet;

public class IsogramChecker {
    public static void main(String[] args) {

        String str = "God he  lp!";
        System.out.println(isIsogram(str));

    }

    static boolean isIsogram(final String str) {
        return str.chars()
                  .filter(Character::isAlphabetic)
                  .map(Character::toLowerCase)
                  .allMatch(new HashSet<>()::add);
    }
}

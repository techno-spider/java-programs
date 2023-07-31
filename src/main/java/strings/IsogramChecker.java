package strings;

import java.util.HashSet;

public class IsogramChecker {
    public static void main(String[] args) {

        String str = "spring";
        String str1 = "AbcD";
        String str2 = "java";
        System.out.println(str + " : " + isIsogramStream(str));
        System.out.println(str1 + " : " + isIsogram(str1));
        System.out.println(str2 + " : " + isIsogram(str2));

    }

    static boolean isIsogramStream(final String str) {
        return str.chars()
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .allMatch(new HashSet<>()::add);
    }

    public static boolean isIsogram(String str) {
        str = str.toLowerCase();
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (uniqueChars.contains(ch)) {
                    return false;
                }
                uniqueChars.add(ch);
            }
        }
        return true;
    }
}

/*
 * output:
 * spring : true
 * AbcD : true
 * java : false
 */
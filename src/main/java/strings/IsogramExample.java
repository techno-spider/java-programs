package strings;

import java.util.HashSet;

public class IsogramExample {
    public static void main(String[] args) {
        String str = "Help me GOD!";
        System.out.println(isIsogram(str));
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

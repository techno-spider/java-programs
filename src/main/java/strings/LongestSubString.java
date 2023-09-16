package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {

        String input = "abcabcbb";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest Substring: " + longestSubstring);

    }

    public static String findLongestSubstring(String str) {
        int n = str.length();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        String longestSubstring = "";

        Set<Character> uniqueChars = new HashSet<>();

        while (right < n) {

            char currentChar = str.charAt(right++);

            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(str.charAt(left++));
            }

            uniqueChars.add(currentChar);

            if (right - left > maxLength) {
                maxLength = right - left;
                longestSubstring = str.substring(left, right);
            }
        }
        return longestSubstring;
    }
}

/*
 * output:
 * Longest Substring: abc
 */
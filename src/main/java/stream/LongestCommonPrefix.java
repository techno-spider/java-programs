package stream;

import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        List<String> words = List.of("flower", "flow", "flight");
        String commonPrefix = findLongestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }

    public static String findLongestCommonPrefix(List<String> words) {
        if (words == null || words.isEmpty()) {
            return "Invalid String";
        }
        String firstWord = words.get(0);

        return words.stream()
                .skip(1) // skip the first word as it will be used as the initial value for the reduction
                .reduce(firstWord, (prefix, word) -> {
                    int length = Math.min(prefix.length(), word.length());
                    int i = 0;
                    while (i < length && prefix.charAt(i) == word.charAt(i)) {
                        i++;
                    }
                    return prefix.substring(0, i);
                });
    }
}

/*
 * output:
 * Longest Common Prefix: fl
 */
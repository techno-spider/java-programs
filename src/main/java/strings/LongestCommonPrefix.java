package strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] words = { "flower", "flow", "flight" };
        String commonPrefix = findLongestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }

    public static String findLongestCommonPrefix(String[] words) {

        if (words == null || words.length == 0) {
            return "Please enter a valid String..";
        }

        // Start with the first word as the potential common prefix
        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            int j = 0;

            // Compare characters until a mismatch is found or end of current word
            while (j < prefix.length() && j < currentWord.length() && prefix.charAt(j) == currentWord.charAt(j)) {
                j++;
            }

            // Update prefix to be the substring up to the mismatch
            prefix = prefix.substring(0, j);

            // If prefix becomes empty, there is no common prefix
            if (prefix.isEmpty()) {
                break;
            }
        }
        return prefix;
    }
}

/*
 * output:
 * Longest Common Prefix: fl
 */
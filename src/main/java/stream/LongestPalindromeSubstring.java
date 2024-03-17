package stream;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {

        String str = "babad";
        System.out.println("Longest Palindrome Substring: " + longestPalindrome(str));
    }

    public static String longestPalindrome(String str) {

        if (str == null || str.length() < 2) {
            return str;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);
            int len2 = expandAroundCenter(str, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return str.substring(start, end - 1);
    }

    private static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

/*
 * output:
 * Longest Palindrome Substring: a
 */
package strings;

public class PalindromeTest {
    public static void main(String[] args) {

        System.out.println("Check Palindrome using for loop: " + isPalindromeStr("Naman"));
        System.out.println("Check palindrome using Collection: " + isPalindrome("MaDAm"));
    }

    static boolean isPalindromeStr(String str) {
        String reversed = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}

/*
 * output:
 * Check Palindrome using for loop: true
 * Check palindrome using Collection: true
 */
package strings;

public class PalindromeTest {
    public static void main(String[] args) {

        String str = "Naman";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome(1001));
    }

    static boolean isPalindrome1(String str) {
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

    static boolean isPalindrome(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = (reversed * 10) + (num % 10);
            num /= 10;
        }
        return num == reversed;
    }

}

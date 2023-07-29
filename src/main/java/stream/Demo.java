package stream;

public class Demo {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Naman"));
        System.out.println(checkPalindrome("Madam"));
    }

    static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }

    static boolean checkPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}

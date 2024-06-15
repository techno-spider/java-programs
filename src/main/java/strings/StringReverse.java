package strings;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        if (str == null || str.isBlank() || str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}

/*
 * output:
 * !dlroW ,olleH
 */
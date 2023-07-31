package strings;

public class Reverse {

    public static void main(String[] args) {

        System.out.println("Reverse String: " + reverseString("my name is khan"));
        System.out.println("Reverse Word: " + reverseWord("my name is khan"));
        System.out.println("Reverse Number: " + reverseNumber(1234));
    }

    static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result.trim();
    }

    static String reverseWord(String str) {
        String result = "";
        String[] strArr = str.trim().split(" ");

        for (int i = strArr.length - 1; i >= 0; i--)
            result += strArr[i] + " ";

        return result;
    }

    static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}

/*
 * output:
 * Reverse String: nahk si eman ym
 * Reverse Word: khan is name my
 * Reverse Number: 4321
 */
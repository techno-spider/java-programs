package collection;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyLetter {
    public static void main(String[] args) {
        String str = "ab1c-d-k5q-mn77g";

        System.out.println("Input String: " + str);
        System.out.println("Output String: " + reverseLetter(str));
    }

    private static String reverseLetter(String str) {
        List<Character> letters = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(letters.remove(letters.size() - 1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

/*
 * output:
 * Input String: ab1c-d-k5q-mn77g
 * Output String: gn1m-q-k5d-cb77a
 */
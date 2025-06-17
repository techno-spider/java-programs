package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWordInSentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        System.out.println("Longest word is: " + longestWord(sc.nextLine()));
    }

    public static String longestWord(String sen) {
        return Arrays.stream(sen.split(" "))
                     .max(Comparator.comparingInt(String::length))
                     .orElse(null);
    }
}

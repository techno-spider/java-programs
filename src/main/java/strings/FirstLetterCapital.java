package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterCapital {
    public static void main(String[] args) {

        String input = "hello world how are you";

        // first two letter capital
        String result = Arrays.stream(input.split(" "))
                              .map(word -> word.substring(0, 2)
                                               .toUpperCase() + word.substring(2))
                              .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

// word.substring(0, 2): returns a substring starting at index 0 and ending at index 2
// word.substring(2): extracts the rest of the word starting from index 2
// Collectors.joining(" "): joins the words with a space character in between


/*
output: HEllo WOrld HOw ARe YOu
*/
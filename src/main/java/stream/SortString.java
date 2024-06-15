package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("dog", "bat", "elephant", "ant", "mouse", "cat");

        // Natural sorting order
        str.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        // Reverse sorting order
        str.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}

/*
 * output:
 * ant bat cat dog elephant mouse
 * mouse
 * elephant
 * dog
 * cat
 * bat
 * ant
 */
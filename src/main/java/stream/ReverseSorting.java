package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSorting {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("dog", "bat", "elephant", "ant", "mouse", "cat");

        str.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}

/*
 * output:
 * mouse
 * elephant
 * dog
 * cat
 * bat
 * ant
 */
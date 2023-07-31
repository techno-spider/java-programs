package stream;

import java.util.Arrays;

public class WordStartsWith {
    public static void main(String[] args) {

        String str = "An empty vessel Makes much noise";

        Arrays.stream(str.split(" "))
                .filter(word -> word.startsWith("m") || word.startsWith("M"))
                .toList()
                .forEach(System.out::println);
    }
}

/*
 * output:
 * Makes
 * much
 */
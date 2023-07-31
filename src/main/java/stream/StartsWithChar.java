package stream;

import java.util.Arrays;
import java.util.List;

public class StartsWithChar {
    public static void main(String[] args) {

        List<String> strList = List.of("java is a Object oriented programming Language. I love java.");

        Arrays.stream(strList.get(0)
                .split(" "))
                .filter(word -> word.startsWith(String.valueOf('l')) || word.startsWith(String.valueOf('L')))
                .forEach(System.out::println);
    }
}

/*
 * output:
 * Language.
 * love
 */
package stream;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountOfChar {
    public static void main(String[] args) {
        String text = "Hello, World!";

        text.chars()
                .filter(ch -> ch != ' ' && ch != ',')
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()))
                .forEach((c, count) -> System.out.println("Character: " + c + ", Count: " + count));
    }
}

package stream;

import java.util.List;

public class LastElement {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three", "four", "five", "six", "seven");

        String lastElement = list.stream()
                                 .reduce((first, second) -> second)
                                 .orElse(null);
        System.out.println("Last Element: " + lastElement);
    }
}

/*
 * output: seven
 * */

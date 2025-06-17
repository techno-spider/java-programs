package stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfWord {
    public static void main(String[] args) {

        List<String> lists = List.of("orange", "cherry", "apple", "cherry", "banana", "apple");

        lists.stream()
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
             .forEach((word, count) -> System.out.println(word + ": " + count));
    }
}

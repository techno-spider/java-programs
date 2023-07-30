package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordInList {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("AA", "BB", "AA", "DD", "CC", "DD");

        Map<String, Long> wordCount = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Words having count>=2: " + wordCount);
    }
}

package stream;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyAscending {
    public static void main(String[] args) {

        String str = "banana";

        List<Entry<Character, Long>> result = str.chars()
                .filter(ch -> ch != ' ' && ch != ',')
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();
        System.out.println(result);
    }
}
/*
 * output:
 * [b=1, n=2, a=3]
 */
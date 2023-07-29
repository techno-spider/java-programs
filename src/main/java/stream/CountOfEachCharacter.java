package stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacter {
    public static void main(String[] args) {

        String str = "Java programming language";

        Map<Character, Long> charCount = str.chars()
                .filter(ch -> ch != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1L, Long::sum));
        charCount.forEach((ch, co) -> System.out.println(ch + " : " + co));
    }
}

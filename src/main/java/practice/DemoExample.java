package practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DemoExample {
    public static void main(String[] args) {

        String str = "samsung";

        Map<Character, Long> charCount = str.chars()
                                            .filter(ch -> ch != ' ' && ch != ',')
                                            .mapToObj(ch -> (char) ch)
                                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charCount.forEach((character,count)-> System.out.println(character+" : "+count));
    }
}
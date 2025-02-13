package stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacter {
    public static void main(String[] args) {

        String text = "Hello, World!";
        String sentence = "Java programming language";
        String str = "coconut";

        // approach 1
        System.out.println("Approach 1:");
        str.chars()
           .mapToObj(ch -> (char) ch)
           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
           .forEach((c, count) -> System.out.println(c + " : " + count));

        // approach 2
        System.out.println("Approach 2:");
        text.chars()
            .filter(ch -> ch != ' ' && ch != ',')
            .mapToObj(ch -> (char) ch)
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
            .forEach((c, count) -> System.out.println("Character: " + c + ", Count: " + count));

        // approach 3
        System.out.println("Approach 3:");
        Map<Character, Long> charCount = sentence.chars()
                                                 .filter(ch -> ch != ' ')
                                                 .mapToObj(c -> (char) c)
                                                 .collect(Collectors.toMap(Function.identity(), c -> 1L, Long::sum));
        charCount.forEach((ch, co) -> System.out.println(ch + " : " + co));
    }
}

/*
 * output:
 * Approach 1:
 * c : 2
 * t : 1
 * u : 1
 * n : 1
 * o : 2
 * Approach 2:
 * Character: H, Count: 1
 * Character: e, Count: 1
 * Character: l, Count: 3
 * Character: o, Count: 2
 * Character: W, Count: 1
 * Character: r, Count: 1
 * Character: d, Count: 1
 * Character: !, Count: 1
 * Approach 3:
 * p : 1
 * a : 5
 * r : 2
 * e : 1
 * u : 1
 * v : 1
 * g : 4
 * i : 1
 * J : 1
 * l : 1
 * m : 2
 * n : 2
 * o : 1
 */
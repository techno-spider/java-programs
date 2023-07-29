package stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSorting {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("dog", "bat", "elephant", "ant", "mouse", "cat");

        str.stream()
           .sorted(Collections.reverseOrder())
           .forEach(System.out::println);

        System.out.println("Local Date: " + LocalDate.now());
        System.out.println("Local Date Time: " + LocalDateTime.now());
    }
}

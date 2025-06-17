package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rohit",
                                           "Virat",
                                           null,
                                           "Surya",
                                           null,
                                           "Bumrah",
                                           "Hardik",
                                           null,
                                           "Shubman",
                                           "Rahul");

        List<String> list = names.stream()
                                 .flatMap(Stream::ofNullable)
                                 .toList();
       // System.out.println(list);

        Stream.iterate(1, n -> n + 2)
              .limit(10)
              .forEach(System.out::println);
    }
}

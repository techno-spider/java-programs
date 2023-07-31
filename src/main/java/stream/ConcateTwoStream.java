package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateTwoStream {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Java 8", "Functional Interface");
        List<String> list2 = Arrays.asList("Stream API", "Lambda Expression");

        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
        concatStream.forEach(System.out::println);
    }
}

/*
 * output:
 * Java 8
 * Functional Interface
 * Stream API
 * Lambda Expression
 */
package stream;

import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        Stream.of("Apple", "Kiwi", "Banana", "Cherry", "Mango")
                .parallel()
                .forEach(System.out::println);
    }
}

/*
 * output:
 * Banana
 * Mango
 * Apple
 * Cherry
 * Kiwi
 */
package stream;

import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        Stream.of("Apple", "Kiwi", "Banana", "Cherry", "Mango")
              .parallel()
              .forEachOrdered(System.out::println);
    }
}

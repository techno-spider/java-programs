package stream;

import java.util.List;
import java.util.stream.Stream;

public class MapMultiExample {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Using multiMap to generate greetings for each name
        names.stream()
             .mapMulti((name, consumer) -> {
                 consumer.accept("Hello, " + name + "!");
                 consumer.accept("How are you " + name + "?");
             })
             .toList()
             .forEach(System.out::println);

        Stream<String> stream = Stream.of("Hello World! How are you?");
        stream.mapMulti((sentence, consumer) -> {
                  for (String word : sentence.split(" ")) {
                      consumer.accept(word);
                  }
              })
              .forEach(System.out::println);
    }
}

/*
 * output:
 * Hello, Alice!
 * How are you Alice?
 * Hello, Bob!
 * How are you Bob?
 * Hello, Charlie!
 * How are you Charlie?
 * Hello
 * World!
 * How
 * are
 * you?
 */
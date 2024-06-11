package practice;

import java.util.List;
import java.util.stream.Stream;

public class DemoExample {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Steve", "Dave");

        names.stream()
                .flatMap((name -> Stream.of(
                        "Hello, " + name + "!",
                        "How are you " + name + "?")))
                .toList()
                .forEach(System.out::println);
    }
}
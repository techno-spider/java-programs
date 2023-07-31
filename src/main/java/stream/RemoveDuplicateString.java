package stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Java", "SpringBoot", "Microservices", "Kafka", "SpringBoot");

        strList.stream()
                .distinct()
                .toList()
                .forEach(System.out::println);
    }
}

/*
 * output:
 * Java
 * SpringBoot
 * Microservices
 * Kafka
 */
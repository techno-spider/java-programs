package stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateString {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Java", "Java", "SpringBoot", "Microservices", "Kafka", "SpringBoot");

        strList.stream()
                .distinct()
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
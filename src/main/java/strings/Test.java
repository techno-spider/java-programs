package strings;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Hello", "java", "springboot", "microservices", "spring security",
                "Webservices");

        strList.parallelStream()
                .forEach(str -> System.out.println(str + " ->" + Thread.currentThread().getName()));
    }
}

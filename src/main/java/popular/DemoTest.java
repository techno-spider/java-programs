package popular;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DemoTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(19, 12, 43, 58, 12, 20, 37, 19, 37, 44, 58, 25);

        HashSet<Integer> set = new HashSet<>();

        list.stream()
                .filter(num -> !set.add(num))
                .forEach(System.out::println);

    }
}

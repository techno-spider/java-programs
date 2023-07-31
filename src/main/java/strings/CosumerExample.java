package strings;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CosumerExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> squareConsm = (num) -> System.out.println(num * num);

        numbers.forEach(squareConsm);
    }
}

/*
 * output:
 * 1
 * 4
 * 9
 * 16
 * 25
 */
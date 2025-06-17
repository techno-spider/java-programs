package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(16, 24, 25, 38, 40);

        Integer min = numbers.stream()
                             .min(Integer::compare)
                             .orElse(0);
        Integer max = numbers.stream()
                             .max(Integer::compare)
                             .orElse(0);

        int[] missingNum = IntStream.rangeClosed(min, max)
                                    .filter(i -> !numbers.contains(i))
                                    .toArray();
        System.out.println("Missing Numbers: " + Arrays.toString(missingNum));
    }
}

package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamTest {
    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            numList.add(i);
        }

        // summing using stream
        long startTime = System.currentTimeMillis();
        int sumUsingS = numList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Sum using Stream: " + sumUsingS);
        System.out.println("Execution time (Stream): " + (endTime - startTime) + " milliseconds");

        // summing using parallel stream
        startTime = System.currentTimeMillis();
        int sumUsingPS = numList.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("Sum using ParallelStream: " + sumUsingPS);
        System.out.println("Execution time (ParallelStream): " + (endTime - startTime) + " milliseconds");
    }
}

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        // using parallel() method
        Stream.of("Apple", "Kiwi", "Banana", "Cherry", "Mango")
              .parallel()
              .forEach(word -> System.out.println(word + ": " + Thread.currentThread()
                                                                      .getName()));
        System.out.println();
        // using parallelStream() method
        List<String> words = Arrays.asList("java", "python", "kotlin", "dart", "javascript");
        words.parallelStream()
             .forEach(word -> System.out.println(word + ": " + Thread.currentThread()
                                                                     .getName()));
    }
}

/*
 * output:
 * Mango: ForkJoinPool.commonPool-worker-2
 * Banana: main
 * Kiwi: ForkJoinPool.commonPool-worker-1
 * Apple: ForkJoinPool.commonPool-worker-3
 * Cherry: ForkJoinPool.commonPool-worker-4

 * python: ForkJoinPool.commonPool-worker-4
 * dart: ForkJoinPool.commonPool-worker-3
 * javascript: ForkJoinPool.commonPool-worker-1
 * kotlin: main
 * java: ForkJoinPool.commonPool-worker-2
 * */
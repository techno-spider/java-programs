package threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // submit a runnable task
        executorService.execute(() -> System.out.println("Task 1 executed."));

        // submit a callable task
        Future<Integer> future = executorService.submit(() -> {
            return 79;
        });

        try {
            System.out.println("Result of Callable: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}

/*
output:
Task 1 executed.
Result of Callable: 79
*/

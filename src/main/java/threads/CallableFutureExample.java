package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // create a Callable task that returns a result
        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42;
        };

        // submit the Callable task to the ExecutorService
        Future<Integer> future = executor.submit(task);
        System.out.println("Task submitted. Waiting for the result...");

        try {
            int result = future.get(); // Blocks until the result is available
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}

/*
 * output:
 * Task submitted. Waiting for the result...
 * Result: 42
 */
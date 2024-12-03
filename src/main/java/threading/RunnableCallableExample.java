package threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableCallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Creating an ExecutorService with a thread pool of size 2
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Using Runnable
        Runnable runnableTask = () -> {
            System.out.println("Runnable task is executing.");
        };
        executor.submit(runnableTask);

        // Using Callable
        Callable<Integer> callableTask = () -> {
            System.out.println("Callable task is executing.");
            return 42; // Return a result
        };
        Future<Integer> future = executor.submit(callableTask);

        // Retrieving the result from the Callable using the Future object
        int result = future.get();
        System.out.println("Callable task result: " + result);

        // Shut down the ExecutorService
        executor.shutdown();
    }
}

/*
 * output:
 * Runnable task is executing.
 * Callable task is executing.
 * Callable task result: 42
 */
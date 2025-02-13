package threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Starting application...");

        // Step-1: fetch user data asynchronously
        CompletableFuture<String> fetchUser = CompletableFuture.supplyAsync(() -> {
            simulateDelay(5000);
            System.out.println("Fetched user data from API");
            return "James Bond"; // simulated user data
        });

        // Step-2: process user data asynchronously
        CompletableFuture<String> processUser = fetchUser.thenApplyAsync(user -> {
            simulateDelay(4000);
            System.out.println("Processing user data...");
            return user.toUpperCase();
        });

        // Step-3: save processed data asynchronously
        CompletableFuture<Void> saveUser = processUser.thenAcceptAsync(user -> {
            simulateDelay(2000);
            System.out.println("Saving processed user data: " + user);
        });

        // wait for all task to complete
        saveUser.join();

        // handling exception in completable future
        CompletableFuture<Integer> resultFuture = CompletableFuture.supplyAsync(() -> 10 / 0)
                                                                   .exceptionally(ex -> 55);
        System.out.println("Exception Result: " + resultFuture.get());

        System.out.println("Application finished");
    }

    public static void simulateDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread()
                  .interrupt();
            e.printStackTrace();
        }
    }
}

/*
 *output:
 * Starting application...
 * Fetched user data from API
 * Processing user data...
 * Saving processed user data: JAMES BOND
 * Exception Result: 55
 * Application finished
 */
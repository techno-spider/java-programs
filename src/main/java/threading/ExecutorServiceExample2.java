package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample2 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> System.out.println("Executing task: " + Thread.currentThread()
                                                                            .getName());

        for (int i = 0; i < 5; i++) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}

/*
output:
Executing task: pool-1-thread-3
Executing task: pool-1-thread-1
Executing task: pool-1-thread-2
Executing task: pool-1-thread-1
Executing task: pool-1-thread-1
*/
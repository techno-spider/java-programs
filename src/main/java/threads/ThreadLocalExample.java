package threads;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable runnable = () -> {
            int randomNumber = ThreadLocalRandom.current().nextInt(100);
            threadLocal.set(randomNumber);
            System.out.println("Thread " + Thread.currentThread().getId() + " set value to: " + randomNumber);
            try {
                Thread.sleep(1000); // Simulate some work in the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int retrievedNumber = threadLocal.get();
            System.out.println("Thread " + Thread.currentThread().getId() + " retrieved value: " + retrievedNumber);
        };

        // Create and start multiple threads
        for (int i = 0; i < 5; i++) {
            new Thread(runnable).start();
        }
    }
}

/*
 * output:
 * Thread 17 set value to: 26
 * Thread 18 set value to: 62
 * Thread 19 set value to: 26
 * Thread 16 set value to: 37
 * Thread 15 set value to: 9
 * Thread 19 retrieved value: 26
 * Thread 17 retrieved value: 26
 * Thread 18 retrieved value: 62
 * Thread 16 retrieved value: 37
 * Thread 15 retrieved value: 9
 */
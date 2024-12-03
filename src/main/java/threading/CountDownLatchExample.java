package threading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {

        int numThreads = 5;

        CountDownLatch latch = new CountDownLatch(numThreads);

        for (int i = 0; i < numThreads; i++) {
            new Thread(() -> {
                System.out.println("Thread " + Thread.currentThread()
                                                     .getId() + " is working...");
                latch.countDown();
            }).start();
        }
        System.out.println("Main thread is waiting...");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads finished.");
    }
}

/*
 * 1. Create a CountDownLatch object with the number of threads as the parameter.
 * 2. Create a new thread for each thread and start it.
 * 3. In each thread, perform the task and call the countDown() method of the CountDownLatch object.
 * 4. In the main thread, call the await() method of the CountDownLatch object to wait for all threads to finish.
 * 5. After all threads have finished, print a message to indicate that all threads have finished.
 *
 * output:
 * Main thread is waiting...
 * Thread 18 is working...
 * Thread 20 is working...
 * Thread 16 is working...
 * Thread 19 is working...
 * Thread 17 is working...
 * All threads finished.
 */
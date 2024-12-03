package threading;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {

        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads have reached the barrier."));

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("Thread " + Thread.currentThread()
                                                     .getId() + " is working...");
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + Thread.currentThread()
                                                     .getId() + " continues...");
            }).start();
        }
    }
}


/*
 * output:
 * Thread 18 is working...
 * Thread 17 is working...
 * Thread 16 is working...
 * All threads have reached the barrier.
 * Thread 16 continues...
 * Thread 18 continues...
 * Thread 17 continues...
 * */
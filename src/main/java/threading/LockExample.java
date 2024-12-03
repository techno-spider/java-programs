package threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private final Lock lock = new ReentrantLock();

    public void performTask() {
        lock.lock();
        try {
            // Critical section - Thread-safe code
            System.out.println("Performing task...");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockExample example = new LockExample();
        example.performTask();
    }
}

/*
 * output:
 * Performing task...
 */
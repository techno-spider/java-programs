package threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public void performTask() {
        lock.lock();
        try {
            System.out.println("Task started...");
            performSubTask();
        } finally {
            lock.unlock();
        }
    }

    private void performSubTask() {
        lock.lock();
        try {
            System.out.println("Subtask executed...");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();
        example.performTask();
    }
}

/*
 * output:
 * Task started...
 * Subtask executed...
 */
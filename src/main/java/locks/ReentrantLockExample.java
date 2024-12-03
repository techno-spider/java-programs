package locks;

import java.util.concurrent.locks.ReentrantLock;

// Provides more flexibility and control compared to intrinsic locks.
// Implemented using Lock interface and ReentrantLock class.
// Provide features like timed locks, interruptible locks, and fairness policies.

public class ReentrantLockExample {

    private final ReentrantLock lock = new ReentrantLock();

    public void method() {
        lock.lock(); // Acquire the lock
        try {
            // critical section
            System.out.println("critical section");
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

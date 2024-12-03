package locks;

// It is the simplest and common locking mechanism in java.
// Associate with every object and class in java.
// When a thread enters a synchronized block or method, it acquires the lock for the object.
// Other threads attempting to enter synchronized sections on the same object are blocked until the lock is released.

public class IntrinsicLock {

    public synchronized void myMethod() {
        // critical section
    }

    public void m1() {
        synchronized (this) {
            // critical section
        }
    }
}

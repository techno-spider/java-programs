package locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class ReadWriteLockExample {

    private final ReadWriteLock  lock=new ReadWriteLock() {
        @Override
        public Lock readLock() {
            return null;
        }

        @Override
        public Lock writeLock() {
            return null;
        }
    };
}

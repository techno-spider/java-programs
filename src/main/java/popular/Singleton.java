package popular;

/* thread-safe singleton pattern using the double-checked locking mechanism */

public class Singleton {
    private static volatile Singleton singletonInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}
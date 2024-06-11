package singleton;

public class Logger {
    private static volatile Logger instance;

    // private constructor to prevent instantiation
    private Logger() {
    }

    // method to get singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // log method to log messages
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
package threads;

public class DaemonThreadExample {
    public static void main(String[] args) {

        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // set the thread as a daemon thread
        daemonThread.setDaemon(true);

        // start daemon thread
        daemonThread.start();

        // main thread sleeps for a short time
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is exiting...");
    }
}

/*
 * output:
 * Daemon Thread is running...
 * Daemon Thread is running...
 * Daemon Thread is running...
 * Daemon Thread is running...
 * Main thread is exiting...
 */
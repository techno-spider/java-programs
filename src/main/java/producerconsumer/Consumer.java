package producerconsumer;

public class Consumer implements Runnable {

    private final SharedQueue queue;

    public Consumer(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                int item = queue.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
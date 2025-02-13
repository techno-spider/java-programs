package producerconsumer.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consume implements Runnable {

    private BlockingQueue<Integer> queue;

    public Consume(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = queue.take();
                System.out.println("Consumed: " + item);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread()
                  .interrupt();
        }
    }
}

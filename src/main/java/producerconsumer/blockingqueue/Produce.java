package producerconsumer.blockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Produce implements Runnable {

    private BlockingQueue<Integer> queue;
    private Random random = new Random();

    public Produce(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int item = random.nextInt(100);
                queue.put(item);
                System.out.println("Produced: " + item);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread()
                  .interrupt();
        }
    }
}

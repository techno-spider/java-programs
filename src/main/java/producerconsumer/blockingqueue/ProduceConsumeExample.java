package producerconsumer.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProduceConsumeExample {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        Thread produceThread = new Thread(new Produce(queue));
        Thread consumeThread = new Thread(new Consume(queue));

        produceThread.start();
        consumeThread.start();
    }
}

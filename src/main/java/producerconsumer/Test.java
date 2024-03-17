package producerconsumer;

public class Test {
    public static void main(String[] args) {

        SharedQueue queue = new SharedQueue(2);

        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}

/*
 * output:
 * Produced: 1
 * Consumed: 1
 * Produced: 2
 * Consumed: 2
 * Produced: 3
 * Consumed: 3
 * Produced: 4
 * Consumed: 4
 * Produced: 5
 */
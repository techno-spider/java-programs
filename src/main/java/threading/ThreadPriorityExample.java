package threading;

public class ThreadPriorityExample {
    public static void main(String[] args) {

        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("High Priority Thread: " + i);
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Low Priority Thread: " + i);
            }
        });
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        highPriorityThread.start();
        lowPriorityThread.start();
    }
}

/*
High Priority Thread: 0
High Priority Thread: 1
High Priority Thread: 2
High Priority Thread: 3
High Priority Thread: 4
Low Priority Thread: 0
Low Priority Thread: 1
Low Priority Thread: 2
Low Priority Thread: 3
Low Priority Thread: 4
*/
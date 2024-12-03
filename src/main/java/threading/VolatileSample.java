package threading;

public class VolatileSample {

    private static volatile boolean flag = false;

    public static void main(String[] args) {

        // thread to update the flag
        Thread updater = new Thread(() -> {
            System.out.println("Updater thread starting...");
            try {
                Thread.sleep(2000); // simulate some work
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
            flag = true; // update the volatile variable
            System.out.println("Flag updated to true by updater thread.");
        });

        // thread to read the flag
        Thread reader = new Thread(() -> {
            System.out.println("Reader thread starting...");
            while (!flag) {
                Thread.onSpinWait(); // busy-wait until flag becomes true
            }
            System.out.println("Reader thread detected flag change.");
        });

        updater.start();
        reader.start();
    }
}

/*
 * output:
 * Reader thread starting...
 * Updater thread starting...
 * Flag updated to true by updater thread.
 * Reader thread detected flag change.
 */

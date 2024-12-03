package threading;

class SharedObj {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
        System.out.println("Flag has been set to true.");
    }

    public void printIfFlagTrue() {
        while (!flag) {
            Thread.onSpinWait();
            // Busy-wait until flag is true
        }
        System.out.println("Flag is now true.");
    }
}

public class VolatileExample {
    public static void main(String[] args) {

        SharedObj sharedObj = new SharedObj();

        // writer thread to set the flag
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread()
                      .interrupt();
            }
            sharedObj.setFlagTrue();
        });

        // reader thread to read the flag
        Thread readerThread = new Thread(sharedObj::printIfFlagTrue);

        writerThread.start();
        readerThread.start();
    }
}

package threading;

public class OddEvenPrinter {
    private final int limit;
    private volatile boolean isOdd = true;

    public OddEvenPrinter(int limit) {this.limit = limit;}

    synchronized void printOdd() {
        for (int i = 1; i <= limit; i += 2) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread()
                          .interrupt();
                }
            }
            System.out.println(Thread.currentThread()
                                     .getName() + " print Odd: " + i);
            isOdd = false;
            notify();
        }
    }

    synchronized void printEven() {
        for (int i = 2; i <= limit; i += 2) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread()
                          .interrupt();
                }
            }
            System.out.println(Thread.currentThread()
                                     .getName() + " print Even: " + i);
            isOdd = true;
            notify();
        }
    }
}

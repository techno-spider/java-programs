package threading;

public class OddEvenPrinterTest {
    public static void main(String[] args) {

        int limit = 10;
        OddEvenPrinter printer = new OddEvenPrinter(limit);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}

/*
 * output:
 * Thread-0 print Odd: 1
 * Thread-1 print Even: 2
 * Thread-0 print Odd: 3
 * Thread-1 print Even: 4
 * Thread-0 print Odd: 5
 * Thread-1 print Even: 6
 * Thread-0 print Odd: 7
 * Thread-1 print Even: 8
 * Thread-0 print Odd: 9
 * Thread-1 print Even: 10
 * */
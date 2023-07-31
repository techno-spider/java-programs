package popular;

public class DemoTest {
    public static void main(String[] args) {
        printNumbers(10);
    }

    static void printNumbers(int num) {
        if (num > 1) {
            printNumbers(num - 1);
        }
        System.out.println(num);
    }
}

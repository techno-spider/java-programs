package popular;

public class PrintNumberUsingRecursion {
    public static void main(String[] args) {
        printNumbers(7);
    }

    static void printNumbers(int num) {
        if (num > 1) {
            printNumbers(num - 1);
        }
        System.out.println(num);
    }
}

/*
 * output:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 */
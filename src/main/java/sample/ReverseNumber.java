package sample;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(getReverse(1234));
    }

    public static long getReverse(long number) {
        long reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
}

/*
 * output:
 * 4321
 */
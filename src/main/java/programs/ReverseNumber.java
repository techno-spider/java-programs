package programs;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseNumber(-18));
    }

    public static long reverseNumber(long number) {
        long reverse = 0;
        while (number != 0) {

            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
}

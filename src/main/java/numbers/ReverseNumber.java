package numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(numberReverse(123));
    }

    static int numberReverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}

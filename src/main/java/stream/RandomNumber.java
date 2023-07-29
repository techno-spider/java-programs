package stream;

import java.util.OptionalInt;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int sum = 0;

        for (int i = 0; i <= 2; i++) {

            OptionalInt optInt = random.ints(1, 100)
                    .findAny();
            int ran = 0;
            if (optInt.isPresent()) {
                ran = optInt.getAsInt();
            }
            sum += ran;
            System.out.println("Random Number " + (i + 1) + ": " + ran);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Single Digit Number: " + calculateSingleDigit(sum));
    }

    public static int calculateSingleDigit(int number) {
        while (number > 9) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}

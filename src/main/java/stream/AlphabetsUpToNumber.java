package stream;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AlphabetsUpToNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 26: ");
        int num = input.nextInt();

        if (num < 1 || num > 26) {
            System.out.println("Invalid number. Please enter a number between 1 to 26.");
        } else {
            IntStream.range(0, num)
                    .mapToObj(i -> (char) ('A' + i))
                    .forEach(alphabet -> System.out.print(alphabet + " "));
        }

        input.close();
    }
}
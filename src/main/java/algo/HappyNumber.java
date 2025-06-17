package algo;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {

        int number = 21;

        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is a not happy number.");
        }
    }

    public static boolean isHappy(int num) {
        HashSet<Integer> seen = new HashSet<>();

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = calculateSum(num);
        }
        return num == 1;
    }

    public static int calculateSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += ((n % 10) * (n % 10));
            n /= 10;
        }
        return sum;
    }
}

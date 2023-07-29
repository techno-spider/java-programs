package stream;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbersExample {
    public static void main(String[] args) {

        int[] nums = {31, 17, 47, 30, 59, 27};
        System.out.println("The missing numbers are: " + missingNumbers(nums));
    }

    public static Set<Integer> missingNumbers(int[] nums) {

        Set<Integer> missNums = new HashSet<>();
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        for (int i = min + 1; i < max; i++) {
            if (!numSet.contains(i)) {
                missNums.add(i);
            }
        }
        return missNums;
    }
}

package arrays;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 9};

        // find min and max
        int min = Arrays.stream(arr)
                        .min()
                        .getAsInt();
        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();

        // put all element into a set for 0(1) lookup
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // check which number are missing in set
        List<Integer> missing = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i))
                missing.add(i);
        }

        System.out.println("Missing numbers are: " + missing);
    }
}

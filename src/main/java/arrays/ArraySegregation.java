package arrays;

import java.util.Arrays;

public class ArraySegregation {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Before segregation: " + Arrays.toString(arr));
        segregateZerosAndOnes(arr);
        System.out.println("After segregation: " + Arrays.toString(arr));
    }

    public static void segregateZerosAndOnes(int[] arr) {

        // pointer for 0's on the left side
        int left = 0;
        // pointer for 1's on the right side
        int right = arr.length - 1;

        while (left < right) {

            // move left pointer until a 1 is encountered
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // move right pointer until a 0 is encountered
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // swap 0 and 1
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}

/*
 * output:
 * Before segregation: [1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0]
 * After segregation: [0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */
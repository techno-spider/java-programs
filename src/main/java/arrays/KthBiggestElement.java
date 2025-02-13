package arrays;

import java.util.Arrays;

public class KthBiggestElement {
    public static void main(String[] args) {
        int[] nums = { 21, 7, 30, 26, 15, 29 };
        int k = 3;

        int KthBiggestElement = findKthBiggestElement(nums, k);
        System.out.println("The " + k + "th biggest element is: " + KthBiggestElement);
    }

    public static int findKthBiggestElement(int[] nums, int k) {
        if (k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid k");
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

/*
 * output:
 * The 3rd biggest element is: 26
 */
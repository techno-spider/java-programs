package arrays;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {

        int[] nums = { 21, 7, 30, 26, 15, 29 };
        int k = 3;

        int KthSmallestElement = findKthSmallestElement(nums, k);
        System.out.println("The " + k + "th smallest element is: " + KthSmallestElement);
    }

    public static int findKthSmallestElement(int[] nums, int k) {
        if (k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid k");
        }
        Arrays.sort(nums);
        return nums[k - 1];
    }
}

/*
 * output:
 * The 3th smallest element is: 21
 */
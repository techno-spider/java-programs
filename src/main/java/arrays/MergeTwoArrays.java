package arrays;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {2, 4, 6};
        int[] arr2 = {1, 3, 5};

        int aLen = arr1.length;
        int bLen = arr2.length;

        int[] mergedArray = new int[aLen + bLen];

        System.arraycopy(arr1, 0, mergedArray, 0, aLen);
        System.arraycopy(arr2, 0, mergedArray, aLen, bLen);

        System.out.println(Arrays.toString(mergedArray));
    }
}

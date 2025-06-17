package arrays;

public class MiddleElementFinder {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50}; // Odd length
        int[] arr2 = {5, 15, 25, 35, 45, 55}; // Even length

        // findMiddle()
        System.out.println("Middle element (Odd): " + findMiddle(arr1));
        System.out.println("Middle element (Even): " + findMiddle(arr2));

        // getMiddle()
        System.out.println("Middle element (Odd): " + getMiddle(arr1));
        System.out.println("Middle element (Even): " + getMiddle(arr2));
    }

    public static int findMiddle(int[] arr) {
        int mid = arr.length / 2;
        return arr.length % 2 == 0 ? arr[mid - 1] : arr[mid];
    }

    public static int getMiddle(int[] arr) {
        return arr[arr.length / 2];
    }
}

/*
output:
Middle element (Odd): 30
Middle element (Even): 25
*/
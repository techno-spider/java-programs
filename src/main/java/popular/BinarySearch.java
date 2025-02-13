package popular;

public class BinarySearch {

    public static int biSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // check if the target is found
            if (arr[mid] == target)
                return mid;
            // If target is greater, ignore the left half
            if (arr[mid] < target)
                start = mid + 1;
                // If target is smaller, ignore the right half
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        // sorted array
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        // Target to find
        int target = 40;

        // Perform binary search
        int result = biSearch(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}

/*
 * output:
 * Target found at index: 3
 */
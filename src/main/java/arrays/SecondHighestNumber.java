package arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {

        int[] numbers = { 37, 10, 34, 19, 23, 45, 16, 22, 31 };
        System.out.println("Second Highest Number: " + findSecondHighest(numbers));

    }

    public static int findSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }
}

/*
 * output:
 * Second Highest Number: 37
 */
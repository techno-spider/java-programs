package arrays;

public class SortOddEvenExample {
    public static void main(String[] args) {
        int[] numbers = {36, 19, 5, 42, 15, 20, 17, 22, 13};
        int[] sortedOrder = sortEvenOdd(numbers);
        // Print the sorted even odd numbers
        for (int num : sortedOrder) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortEvenOdd(int[] numbers) {
        int[] sortedNumbers = new int[numbers.length];
        int evenIndex = 0;
        int oddIndex = numbers.length - 1;
        //Traverse the number array
        for (int num : numbers) {
            // If the number is even, place it at the beginning of the sortedNumbers array
            if (num % 2 == 0) {
                sortedNumbers[evenIndex] = num;
                evenIndex++;
            }
            // If the number is odd, place it at the end of the sortedNumbers array
            else {
                sortedNumbers[oddIndex] = num;
                oddIndex--;
            }
        }
        return sortedNumbers;
    }
}

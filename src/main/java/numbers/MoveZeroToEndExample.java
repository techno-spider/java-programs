package numbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeroToEndExample {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(List.of(1, 0, 0, 2, 0, 4, 9, 0, 5));
        moveZerosToEnd(numList);
        System.out.println(numList);
        // LinkedList<Integer> result = moveZeros(numList);
        System.out.println(moveZerosToStart(numList));
    }

    private static void moveZerosToEnd(List<Integer> numList) {
        int writeIndex = 0;

        for (int readIndex = 0; readIndex < numList.size(); readIndex++) {
            int num = numList.get(readIndex);
            if (num != 0) {
                numList.set(writeIndex, num);
                writeIndex++;
            }
        }

        while (writeIndex < numList.size()) {
            numList.set(writeIndex, 0);
            writeIndex++;
        }
    }

    static LinkedList<Integer> moveZerosToStart(List<Integer> numList) {
        return numList.stream()
                      .sorted()
                      .collect(Collectors.toCollection(LinkedList::new));
    }
}

/*
 * output:
 * [1, 2, 4, 9, 5, 0, 0, 0, 0]
 * [0, 0, 0, 0, 1, 2, 4, 5, 9]
 */
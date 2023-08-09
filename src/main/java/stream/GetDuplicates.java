package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetDuplicates {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 21, 16, 37, 58, 23, 39, 27, 37, 16, 58);

        // System.out.println("Duplicates using for loop: " + getDuplicates(numbers));

        Set<Integer> set = new HashSet<>();

        numbers.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
    }

    // Using normal for loop
    /*
     * static List<Integer> getDuplicates(List<Integer> numList) {
     * List<Integer> aList = new ArrayList<>();
     * if (numList.size() > 1) {
     * for (int i = 0; i < numList.size(); i++) {
     * for (int j = i + 1; j < numList.size(); j++) {
     * if (numList.get(i).equals(numList.get(j))) {
     * aList.add(numList.get(j));
     * }
     * }
     * }
     * }
     * return aList;
     * }
     */
}
/*
 * output:
 * 37
 * 16
 * 58
 */
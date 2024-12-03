package collection;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashSet {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(72);
        set.add(38);
        set.add(94);
        set.add(5);
        set.add(41);
        set.add(67);
        set.add(88);
        set.add(13);
        set.add(49);

        Set<Integer> naturalSorting = set.stream()
                                         .sorted()
                                         .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("HashSet Natural Sort: " + naturalSorting);

        Set<Integer> reverseSorting = set.stream()
                                         .sorted(Comparator.reverseOrder()) // reverse order
                                         .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("HashSet Reverse Sort: " + reverseSorting);

        // collect in list
        List<Integer> listSorted = set.stream()
                                      .sorted()
                                      .toList();
        System.out.println("List Sorted: " + listSorted);

        // collect in ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        System.out.println("ArrayList Sorted: " + arrayList);
    }
}

/*
 * output:
 * HashSet Natural Sort: [5, 13, 38, 41, 49, 67, 72, 88, 94]
 * HashSet Reverse Sort: [94, 88, 72, 67, 49, 41, 38, 13, 5]
 * List Sorted: [5, 13, 38, 41, 49, 67, 72, 88, 94]
 * ArrayList Sorted: [5, 13, 38, 41, 49, 67, 72, 88, 94]
 */
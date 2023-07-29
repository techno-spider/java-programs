package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

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

        System.out.println("HashSet Sort: " + set);

        List<Integer> streamSorted = set.stream()
                .sorted()
                .toList();
        System.out.println("Stream Sorted: " + streamSorted);

        ArrayList<Integer> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        System.out.println("ArrayList Sorted: " + arrayList);

        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        System.out.println("TreeSet Sorted: " + sortedSet);
    }
}

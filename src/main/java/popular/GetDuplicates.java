package popular;

import java.util.*;

public class GetDuplicates {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(53, 29, 15, 53, 22, 47, 15, 29, 30, 26);
        System.out.println("Duplicate numbers are: " + getDuplicatesNumber(numList));

        List<String> strList = List.of("java", "java", "spring", "react", "javascript", "react");
        System.out.println("Duplicate strings are: " + getDuplicatesString(strList));

        System.out.println("Duplicate numbers using generics: " + getDuplicatesG(numList));
        System.out.println("Duplicate strings using generics: " + getDuplicatesG(strList));

        System.out.println("Duplicate numbers time space complexity O(n): " + getDuplicatesOptimized(numList));
    }

    // get duplicate using generics
    static <T> List<T> getDuplicatesG(List<T> list) {

        List<T> duplicateList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i)
                        .equals(list.get(j))) {
                    duplicateList.add(list.get(j));
                }
            }
        }
        return duplicateList;
    }

    // using time space complexity O(n)
    static <T> List<T> getDuplicatesOptimized(List<T> list) {
        Set<T> seen = new HashSet<>();
        Set<T> duplicates = new HashSet<>();

        for (T item : list) {
            if (!seen.add(item)) { //if present false
                duplicates.add(item); // Already seen, so it's a duplicate
            }
        }
        return new ArrayList<>(duplicates);
    }

    // get duplicate numbers
    static List<Integer> getDuplicatesNumber(List<Integer> numList) {
        List<Integer> aList = new ArrayList<>();
        if (numList.size() > 1) {
            for (int i = 0; i < numList.size(); i++) {
                for (int j = i + 1; j < numList.size(); j++) {
                    if (numList.get(i)
                               .equals(numList.get(j))) {
                        aList.add(numList.get(j));
                    }
                }
            }
        }
        return aList;
    }

    // get duplicate strings
    static List<String> getDuplicatesString(List<String> strList) {
        List<String> aList = new ArrayList<>();
        if (strList.size() > 1) {
            for (int i = 0; i < strList.size(); i++) {
                for (int j = i + 1; j < strList.size(); j++) {
                    if (strList.get(i)
                               .equals(strList.get(j))) {
                        aList.add(strList.get(j));
                    }
                }
            }
        }
        return aList;
    }
}

/*
 * output:
 * Duplicate numbers are: [53, 29, 15]
 * Duplicate strings are: [java, react]
 * Duplicate numbers using generics: [53, 29, 15]
 * Duplicate strings using generics: [java, react]
 * Duplicate numbers time space complexity O(n): [53, 29, 15]
 */
package popular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetDuplicates {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(53, 29, 15, 53, 22, 47, 15, 29, 30, 26);
        System.out.println("Duplicate numbers are: " + getDuplicatesNumber(numList));

        List<String> strList = List.of("java", "java", "spring", "react", "javascript", "react");
        System.out.println("Duplicate strings are: " + getDuplicatesString(strList));
    }

    // get duplicate numbers
    static List<Integer> getDuplicatesNumber(List<Integer> numList) {
        List<Integer> aList = new ArrayList<>();
        if (numList.size() > 1) {
            for (int i = 0; i < numList.size(); i++) {
                for (int j = i + 1; j < numList.size(); j++) {
                    if (numList.get(i).equals(numList.get(j))) {
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
                    if (strList.get(i).equals(strList.get(j))) {
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
 */
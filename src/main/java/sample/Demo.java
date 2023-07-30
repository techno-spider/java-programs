package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(53, 29, 15, 53, 22, 47, 15, 29, 30, 26);
        System.out.println(getDuplicates(numList));

    }

    static List<Integer> getDuplicates(List<Integer> numList) {
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
}

package collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // natural sorting order(ascending soring order)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(42, "forty two");
        treeMap.put(29, "twenty nine");
        treeMap.put(13, "thirteen");
        treeMap.put(90, "ninety");
        treeMap.put(57, "fifty seven");
        treeMap.put(10, "ten");
        treeMap.put(25, "twenty five");
        treeMap.put(37, "thirty seven");
        treeMap.put(22, "twenty two");
        treeMap.put(51, "fifty one");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}

/*
output:
10: ten
13: thirteen
22: twenty two
25: twenty five
29: twenty nine
37: thirty seven
42: forty two
51: fifty one
57: fifty seven
90: ninety
*/
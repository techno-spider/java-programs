package practice;

import java.util.Map;
import java.util.TreeMap;

public class Example {
    public static void main(String[] args) {

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

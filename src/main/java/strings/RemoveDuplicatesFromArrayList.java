package strings;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<>();

        aList.add("java");
        aList.add("java");
        aList.add("spring");
        aList.add("springboot");
        aList.add("springboot");
        aList.add("hibernate");
        aList.add("jpa");
        aList.add("jpa");

        HashSet<String> set = new HashSet<>(aList);

        System.out.println("Size: " + aList.size());
        aList.clear();
        System.out.println("Size: " + aList.size());
        aList.addAll(set);
        System.out.println("Size: " + aList.size());
        System.out.println(aList);
    }
}

package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);

        Set<Integer> set = new HashSet<>(list);

        List<Integer> newList = new ArrayList<>(set);

        newList.forEach(num -> System.out.println(num));
    }
}

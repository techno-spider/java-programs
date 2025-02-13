package stream;

import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {

        List<List<Integer>> numList = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));

        List<Integer> flatmapList = numList.stream()
                                           .flatMap(List::stream)
                                           .toList();
        System.out.println(flatmapList);
    }
}

/*
 * output:
 * [1, 2, 3, 4, 5, 6]
 */
package collection;

import java.util.LinkedList;

public class ReverseLinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> int_list_1 = new LinkedList<>();
        int_list_1.add(42);
        int_list_1.add(27);
        int_list_1.add(30);
        System.out.println("Original list: " + int_list_1);

        LinkedList<Integer> int_list_2 = new LinkedList<>();
        int_list_1.descendingIterator().forEachRemaining(int_list_2::add);
        System.out.println("Reverse List: " + int_list_2);

        LinkedList<String> str_list_1 = new LinkedList<>();
        str_list_1.add("java");
        str_list_1.add("springboot");
        str_list_1.add("hibernate");
        System.out.println("Original list: " + str_list_1);

        LinkedList<String> str_list_2 = new LinkedList<>();
        str_list_1.descendingIterator().forEachRemaining(str_list_2::add);
        System.out.println("Reverse List: " + str_list_2);
    }
}

/*
 * output:
 * Original list: [42, 27, 30]
 * Reverse List: [30, 27, 42]
 */

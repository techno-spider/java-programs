package collection;

import java.util.Hashtable;
import java.util.stream.Stream;

public class HashTableExample {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(2, "Apple");
        hashtable.put(8, "mango");
        hashtable.put(3, "orange");
        hashtable.put(4, "banana");
        hashtable.put(1, "Berry");
        hashtable.put(6, "grapes");
        hashtable.put(5, "kiwi");

        Stream.of(hashtable)
                .forEachOrdered(System.out::println);

        System.out.println("Elements: " + hashtable);
        System.out.println("Size: " + hashtable.size());
        System.out.println("HashCode: " + hashtable.hashCode());
    }
}

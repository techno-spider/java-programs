package collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapIterationExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals("two")) {
                map.remove(entry.getKey());
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

/*
 * output:
 * Key: one, Value: 1
 * Key: three, Value: 3
 */
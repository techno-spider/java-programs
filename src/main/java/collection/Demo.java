package collection;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Create a separate keySet to iterate over
        for (String key : new HashMap<>(map).keySet()) {
            if (key.equals("two")) {
                map.remove(key);
            }
        }

        // Print the remaining entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

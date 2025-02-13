package collection;

import java.util.HashMap;

public class ObjectAsKeyTest {
    public static void main(String[] args) {

        HashMap<ObjectAsKey, String> map = new HashMap<>();

        ObjectAsKey key1 = new ObjectAsKey(1, "Key1");
        ObjectAsKey key2 = new ObjectAsKey(2, "Key2"); // Value2

        map.put(key1, "Value1");
        map.put(key2, "Value2");

        System.out.println(map.get(key1));
        System.out.println(map.get(key2));

        ObjectAsKey key3 = new ObjectAsKey(1, "Key1");

        System.out.println(key1.equals(key3)); // true

        System.out.println(map.get(key3)); // Value1
    }
}

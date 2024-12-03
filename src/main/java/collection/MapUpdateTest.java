package collection;

import java.util.HashMap;
import java.util.Map;

public class MapUpdateTest {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Bahubali", "Mahesh");
        map.put("Bhallaldev", "Rana");
        map.put("Devsena", "Anushka");
        map.put("Katappa", "Sathyaraj");
        map.put("Sivagami", "Ramya");

        // only modify if key already exist in the map
        map.computeIfPresent("Bahubali", (key, value) -> "Pravash");

        // only modify if key doesn't exist in the map
        map.computeIfAbsent("Rocky Bhai", (value) -> "Yash");

        map.entrySet()
           .iterator()
           .forEachRemaining(System.out::println);
    }
}

/*
 * output:
 * Rocky Bhai=Yash
 * Sivagami=Ramya
 * Katappa=Sathyaraj
 * Bahubali=Pravash
 * Bhallaldev=Rana
 * Devsena=Anushka
 */
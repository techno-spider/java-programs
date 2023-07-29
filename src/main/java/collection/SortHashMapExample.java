package collection;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 29);
        hashMap.put("Mike", 27);
        hashMap.put("Carolina", 23);
        hashMap.put("Steve", 27);
        hashMap.put("Sophia", 26);
        hashMap.put("Michael", 27);
        hashMap.put("Scarlett", 28);
        hashMap.put("Natalie", 25);

        /*
         * LinkedHashMap<String, Integer> sorted = hashMap.entrySet()
         * .stream()
         * .sorted(Map.Entry.comparingByValue())
         * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
         * (e1, e2) -> e1, LinkedHashMap::new));
         * System.out.println(sorted.toString());
         */

        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        /*
         * hashMap.entrySet()
         * .stream()
         * .sorted(Comparator.comparing(Map.Entry::getValue))
         * .forEach(entry -> System.out.println(entry.getKey() + " = " +
         * entry.getValue()));
         */
    }
}

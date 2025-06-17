package strings;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {

        String str = "pizza";

        characterCount(str);
    }

    private static void characterCount(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*
p : 1
a : 1
i : 1
z : 2
*/
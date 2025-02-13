package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
print only unique character
input: welcome
output: wlcom
*/

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "welcome";

        String unique = str.chars()
                           .mapToObj(c -> (char) c)
                           .collect(Collectors.groupingBy(Function.identity(),
                                                          LinkedHashMap::new,
                                                          Collectors.counting()))
                           .entrySet()
                           .stream()
                           .filter(entry -> entry.getValue() == 1)
                           .map(Map.Entry::getKey)
                           .map(String::valueOf)
                           .collect(Collectors.joining());

        System.out.println("unique: " + unique);
    }
}



/*
output: wlcom
*/

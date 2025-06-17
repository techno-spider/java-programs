package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringDecompression {
    public static void main(String[] args) {

        String input = "2ag3bc2mr";

        System.out.println("Decompressed String: " + decompress(input));
    }

    public static String decompress(String input) {
        Pattern pattern = Pattern.compile("(\\d+)([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input);

        return matcher.results()
                      .map(mt -> mt.group(2)
                                   .repeat(Integer.parseInt(mt.group(1))))
                      .collect(Collectors.joining());
    }
}


/*
 * Input: 2ag3bc2mr
 * Output: agagbcbcbcmrmr
 */
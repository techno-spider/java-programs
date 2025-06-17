package strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbbbccdee";
        String compressedString = compressString(str);
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + compressedString);
    }

    private static String compressString(String str) {
        if (str == null || str.isBlank()) {
            return str;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        if (compressed.length() >= str.length()) {
            return str;
        } else {
            return compressed.toString();
        }
    }
}

/*
 * output:
 * Original String: aabbbbccdee
 * Compressed String: a2b4c2d1e2
 */
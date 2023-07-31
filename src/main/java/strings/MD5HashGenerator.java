package strings;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

/*
 * MD5 (Message-Digest algorithm 5) is a cryptographic function for creating 128-bit hashes from a string.
 * generateMD5Hash() is accepts a string and returns the MD5 hash for that string.*/

public class MD5HashGenerator {

    public static void main(String[] args) {
        String input = "HelloWorld123";

        String md5Hash = generateMD5Hash(input);

        System.out.println("Input: " + input);
        System.out.println("MD5 Hash: " + md5Hash);
    }

    public static String generateMD5Hash(String input) {
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Compute the MD5 hash
            byte[] hashBytes = md.digest(input.getBytes());

            // Convert the hash bytes to a formatted string
            StringBuilder stringBuilder = new StringBuilder();
            try (Formatter formatter = new Formatter(stringBuilder)) {
                for (byte hashByte : hashBytes) {
                    formatter.format("%02x", hashByte);
                }
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception if the MD5 algorithm is not available
            e.printStackTrace();
        }
        return null;
    }
}

/*
 * output:
 * Input: HelloWorld123
 * MD5 Hash: 624825620c7cdd818e697366727aa594
 */

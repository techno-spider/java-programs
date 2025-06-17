package strings;

public class ImmutableStringExample {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = s1;

        System.out.println(s1 == s2);       // ❌ false (different references: pool vs heap)
        System.out.println(s1.equals(s2));  // ✅ true  (same content)
        System.out.println(s1 == s3);       // ✅ true  (same reference)

    }
}

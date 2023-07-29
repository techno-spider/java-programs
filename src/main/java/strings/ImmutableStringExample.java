package strings;

public class ImmutableStringExample {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;

        System.out.println(s3);
        System.out.println(s3.equals(s2));
    }
}

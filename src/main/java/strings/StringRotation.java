package strings;

public class StringRotation {
    public static void main(String[] args) {

        String str = "abcde";

        System.out.println("Left(2 place) Rotation of 'abcde': " + leftRotate(str, 2));
        System.out.println("Right(2 place) Rotation of 'abcde': " + rightRotate(str, 2));

    }

    private static String leftRotate(String str, int i) {
        return str.substring(i) + str.substring(0, i);
    }

    private static String rightRotate(String str, int i) {
        return leftRotate(str, str.length() - i);
    }
}

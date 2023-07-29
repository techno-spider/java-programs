package strings;

public class ReverseOnlyCharacter {
    public static void main(String[] args) {
        String str = "foa1-tr-76s-w3-m";
        System.out.println(reverseOnlyLetters(str));
    }

    private static String reverseOnlyLetters(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}

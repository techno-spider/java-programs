package strings;

public class ReverseOnlyCharacter {
    public static void main(String[] args) {
        String str = "foa1-tr-76s-w3-m";
        System.out.println("Original String: " + str);
        System.out.println("String after reverse the character only: " + getReverseCharOnly(str));
    }

    private static String getReverseCharOnly(String str) {
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

/*
 * output:
 * Original String: foa1-tr-76s-w3-m
 * String after reverse the character only: mws1-rt-76a-o3-f
 */
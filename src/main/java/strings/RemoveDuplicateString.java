package strings;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "java1123";
        System.out.println(removeDuplicate(str));
    }

    static String removeDuplicate(String str) {
        StringBuilder output = new StringBuilder();
        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            if (output.indexOf(String.valueOf(c)) == -1)
                output.append(c);
        }
        return output.toString();
    }
}

/*
 * output:
 * jav123
 */

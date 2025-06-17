package strings;

public class DeleteBeforeAfterCharacters {
    public static void main(String[] args) {

        String str = "*abc*dm*gha"; // expected: bha

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // skip the character before '*'
            if (i > 0 && str.charAt(i - 1) == '*')
                continue;
            // skip the character after '*'
            if (i < str.length() - 1 && str.charAt(i + 1) == '*')
                continue;
            // skip the '*' itself
            if (str.charAt(i) == '*')
                continue;
            result.append(str.charAt(i));
        }
        System.out.println("Result: " + result);
    }
}

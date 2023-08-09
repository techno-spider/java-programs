package strings;

public class RemoveWhiteSpaceExample {
    public static void main(String[] args) {

        System.out.println(removeWhiteSpace("string test"));
    }

    static String removeWhiteSpace(String input) {
        StringBuilder output = new StringBuilder();
        char[] charArr = input.toCharArray();

        for (char c : charArr) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        return output.toString();
    }
}

/*
 * output:
 * stringtest
 */
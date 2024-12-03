package strings;

public class RemoveWhiteSpaceExample {
    public static void main(String[] args) {

        String str = "st    ring test";

        System.out.println(removeWhiteSpace(str));
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
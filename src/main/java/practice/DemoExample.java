package practice;

public class DemoExample {
    public static void main(String[] args) {

        String str = "Java1234";

    }

    static String removeDuplicateString(String str) {
        StringBuilder output = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (output.indexOf(String.valueOf(ch)) == -1)
                output.append(ch);
        }
        return output.toString();
    }
}
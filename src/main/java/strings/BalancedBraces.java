package strings;

import java.util.Stack;

public class BalancedBraces {
    public static void main(String[] args) {

        String braces1 = "{[()]}";
        String braces2 = "{[(])}]";

        System.out.println("Is " + braces1 + " is a balanced String?: " + isBalanced(braces1));
        System.out.println("Is " + braces2 + " is a balanced String?: " + isBalanced(braces2));
    }

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                // Check if stack is empty before popping
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false; // Unbalanced if stack is empty before matching closing brace
                }
            } else {
                return false; // Invalid character
            }
        }
        return stack.isEmpty();
    }
}

/*
 * output:
 * Is {[()]} is a balanced String?: true
 * Is {[(])}{ is a balanced String?: false
 */
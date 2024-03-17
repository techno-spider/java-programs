package practice;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("welcome");
        stack.push("to");
        stack.push("the");
        stack.push("java");
        stack.push("world");

        System.out.println("Initial Stack: " + stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop operation: " + stack);
    }
}
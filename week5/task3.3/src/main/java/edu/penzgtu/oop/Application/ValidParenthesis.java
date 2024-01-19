package edu.penzgtu.oop.Application;

import java.util.Stack;

public class ValidParenthesis {
    public static void main( String[] args ) {
        char[] parenthesis = new char[] {'(', ')', '{', '}', '[', ']'};
        System.out.println(new String(parenthesis) + "\nresult: " +isValid(parenthesis));
    }

    private static boolean isValid(char[] parenthesis) {
        Stack<Character> stack = new Stack<>();
        for (char x : parenthesis) {
            if(x=='('){
                stack.push(')');
            } else if (x=='{') {
                stack.push('}');

            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

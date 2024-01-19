package edu.penzgtu.Application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main( String[] args ) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('(', ')', '[', ']', '{', '}'));
        System.out.println(list + "\nresult: " + isValid(list));
    }
    public static boolean isValid(ArrayList<Character> parenthesis) {
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

package edu.penzgtu.Application;
import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {
    public static void main( String[] args ) {
        GraphicChart.outGraphicChart();
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

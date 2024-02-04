import stack.Stack;
import stack.StackImpl;

public class App {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new StackImpl<>(3);
        integerStack.push(1);
        integerStack.push(10);
        integerStack.push(100);
        System.out.println(integerStack);
        while (!integerStack.isEmpty()) {
            System.out.println("Полученное значение - ".concat(integerStack.pop().toString()));
        }
        System.out.println("Очередь пуста");
    }
}

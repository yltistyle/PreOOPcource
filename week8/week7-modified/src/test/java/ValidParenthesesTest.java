import edu.penzgtu.Application.GraphicChart;
import edu.penzgtu.Application.ValidParentheses;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    public void testTimeFunction() {
        ValidParentheses validParenthesis = new ValidParentheses();
        ArrayList<Character> list = GraphicChart.generateParenthesis(10000);
        long time = System.nanoTime();
        validParenthesis.isValid(list);
        time = System.nanoTime()-time;
        System.out.println("Execution time: " + time + " ns");
    }

    @Test
    public void testIsValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid(new ArrayList<>(Arrays.asList('(', ')'))));
        assertTrue(validParentheses.isValid(new ArrayList<>(Arrays.asList('(', ')', '[', ']', '{', '}'))));
        assertFalse(validParentheses.isValid(new ArrayList<>(Arrays.asList('(', ']'))));
        assertFalse(validParentheses.isValid(new ArrayList<>(Arrays.asList('(', '[', ')', ']'))));
        assertTrue(validParentheses.isValid(new ArrayList<>(Arrays.asList('{', '[', ']', '}'))));
        assertFalse(validParentheses.isValid(new ArrayList<>(Arrays.asList(']'))));
        assertFalse(validParentheses.isValid(new ArrayList<>(Arrays.asList('(', ']', ')'))));
    }
}

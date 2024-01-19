import edu.penzgtu.Application.ValidParentheses;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {
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

package edu.penzgtu.oop.task13;
import java.util.regex.PatternSyntaxException;

public class RegexpException extends Exception {
    public static final String REGEXP = "((\\d{2}-?(([0-4]?\\d)|-?50|))@){1,128}";
    public RegexpException(String message, String string) {
        super(message);

        if (string.length() > 644) {
            throw new IndexOutOfBoundsException("Entering a string greater than the allowed value");
        }
        throw new PatternSyntaxException(string, REGEXP, -1);
    }
}

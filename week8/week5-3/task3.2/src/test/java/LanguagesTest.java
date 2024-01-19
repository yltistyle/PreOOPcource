import edu.penzgtu.oop.Application.Languages;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LanguagesTest {
    @Test
    public void languagesTest() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        Languages.print
                (
                "3\n" +
                "3\n" +
                "Russian\n" +
                "English\n" +
                "Japanese\n" +
                "2\n" +
                "Russian\n" +
                "English\n" +
                "1\n" +
                "English"
                );
        Languages.print
                (
                "4\n" +
                "3\n" +
                "Russian\n" +
                "Spanish\n" +
                "German\n" +
                "3\n" +
                "Russian\n" +
                "German\n" +
                "Spanish\n" +
                "3\n" +
                "Spanish\n" +
                "Russian\n" +
                "German\n" +
                "3\n" +
                "German\n" +
                "Russian\n" +
                "Spanish"
                );
        Languages.print
                (
                "5\n" +
                "1\n" +
                "German\n" +
                "1\n" +
                "German\n" +
                "1\n" +
                "German\n" +
                "1\n" +
                "German\n" +
                "1\n" +
                "German"
                );
        String output = outputStreamCaptor.toString().trim();
        assertEquals(
        "1:\n" +
                "English\n" +
                "3:\n" +
                "English\n" +
                "Japanese\n" +
                "Russian\n" +
                "\n" +
                "3:\n" +
                "German\n" +
                "Russian\n" +
                "Spanish\n" +
                "3:\n" +
                "German\n" +
                "Russian\n" +
                "Spanish\n" +
                "\n" +
                "1:\n" +
                "German\n" +
                "1:\n" +
                "German"
                ,
                output);
        System.setOut(System.out);
    }
}

import edu.penzgtu.oop.Application.RemoveDuplicates;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicatesTest {

    @Test
    public void testRemoveDuplicatesEmptyList() {
        ArrayList<Integer> inputList = new ArrayList<>();
        RemoveDuplicates.removeDuplicates(inputList);
        assertTrue(inputList.isEmpty());
    }

    @Test
    public void testRemoveDuplicatesNoDuplicates() {
        ArrayList<Integer> inputList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> expectedList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedList, inputList);
    }

    @Test
    public void testRemoveDuplicatesWithDuplicates() {
        ArrayList<Integer> inputList = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> expectedList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedList, inputList);
    }
}

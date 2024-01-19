package edu.penzgtu.oop.task11;

import org.junit.jupiter.api.Test;

import static edu.penzgtu.oop.task11.CountsSubstring.countSubstring;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountsSubstringTest {

    @Test
    public void nullSubstringTest() {
        assertEquals(countSubstring("value", ""), 0);
        assertEquals(countSubstring("", "value"), 0);
    }
    @Test
    public void SubstringTest() {
        assertEquals(countSubstring("StringString", "Str"), 2);
        assertEquals(countSubstring("obj", "obj"), 1);
        assertEquals(countSubstring("11111", "1"), 5);
    }
}

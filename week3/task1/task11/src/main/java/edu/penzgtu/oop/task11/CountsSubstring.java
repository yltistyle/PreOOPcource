package edu.penzgtu.oop.task11;

public class CountsSubstring {

    public static void main( String[] args ) {
        String string = "anagram";
        String substring = "a";
        System.out.printf("String: %s\nSubstring: %s\nCount: %d", string, substring, countSubstring(string, substring));
    }

    static int countSubstring(String string, String substring) {
        if (substring.isEmpty()) {
            return 0;
        }
        int oldLength = string.length();
        while (string.contains(substring)) {
            string = string.replace(substring, "");
        }
        return (oldLength-string.length())/substring.length();
    }
}

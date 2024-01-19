package edu.penzgtu.oop.task23;

public class Dublicates {
    public static void main( String[] args ) {
        String string= "Plllayyyeeer";
        System.out.printf("Input: %s\nOutput: %s", string, removeDublicates(string));
    }
    static String removeDublicates(String string) {
        return string.replaceAll("(.)\\1{2,}", "$1");
    }
}

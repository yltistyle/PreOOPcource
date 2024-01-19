package edu.penzgtu.oop.task13;

public class FileException extends Exception {
    final static String STRING = "\nFile not found. Check the existence of such a file";
    public FileException() {
        super(STRING);
    }
}
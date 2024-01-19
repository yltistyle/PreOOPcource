package edu.penzgtu.oop.task12;

public class InputError extends NumberFormatException {

    private static final String MESSAGE = " - invalid input data";
    public InputError(String type) {
        super(type+MESSAGE);
    }
}


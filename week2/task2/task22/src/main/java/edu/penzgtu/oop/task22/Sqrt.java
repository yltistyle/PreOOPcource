package edu.penzgtu.oop.task22;

public class Sqrt {
    static final double maxDoubleForInt = 9.99999998E17;
    public static void main( String[] args ) {
        int value = 25;
        System.out.println("Input: "+ value + "\nresult: " + Sqrt.sqrt(25));
    }

    static int sqrt(double value) {
        double x = 1.0F;
        if (value < 1) {
            System.err.println("Num < 1");
            throw new ArithmeticException("Sqrt(arg) < 0");
        } else if (value > Sqrt.maxDoubleForInt) {
            System.err.println("Double out of range");
            throw new ArithmeticException("For an integer result, the double type is too large");
        }

        double curr = 0.0000001D;
        while (Math.abs(x*x-value) > curr) {
            x = (x * x + value) / 2.D / x;
        }
        return (int)x;
    }
}
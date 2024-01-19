package edu.penzgtu.oop.Application;

public class Time {
    public static void main(String[] args) {
        long time = 0;
        time = System.nanoTime();
        Fibonacci.recursiveFibo(40);
        System.out.println(System.nanoTime()-time + " Recursive Version");
        time = System.nanoTime();
        Fibonacci.cacheFibo(40);
        System.out.println(System.nanoTime()-time + " Cache Version");
        time = System.nanoTime();
        Fibonacci.iterativeFibo(40);
        System.out.println(System.nanoTime()-time + " Iterative Version");
    }

}
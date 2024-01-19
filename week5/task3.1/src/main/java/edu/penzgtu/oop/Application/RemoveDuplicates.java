package edu.penzgtu.oop.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main( String[] args ) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println(list + "\nresult: " +removeDuplicates(list));
    }
    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
         return new ArrayList<>(new HashSet<>(list));
    }
}

package edu.penzgtu.oop.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main( String[] args ) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        System.out.println("Before: " + list);
        removeDuplicates(list);
        System.out.println("result: " + list);
    }
    public static void removeDuplicates(ArrayList<Integer> list) {
         Set<Integer> set = new HashSet<>(list);
         list.clear(); list.addAll(set);
    }
}

package com.mycompany.app;

import java.util.ArrayList;
import java.util.Random;
public class RandomLists {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void fillList(int value) {
        Random rand = new Random();
        for (int i = 0; i < value; i++) {list.add(rand.nextInt(1000));}
    }

    public static void printSortedListByQuickSort() {
        for (int i = 1; i < 10; i++) {
            RandomLists.fillList(i);
            System.out.println("List:\n" + list);

            System.out.println("Sorted List:\n" + Quicksort.quickSort(list) + "\n");
            list.clear();
        }
    }
}
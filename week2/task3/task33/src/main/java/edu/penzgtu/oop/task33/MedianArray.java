package edu.penzgtu.oop.task33;

import java.util.Arrays;

public class MedianArray {
    public static void main( String[] args ) {
        MedianArray print = new MedianArray();

        int[] arr = {-11, 23, 81, 1, 5, 12};
        System.out.println(print.medianArr(arr));
    }
    int medianArr(int[] arr) {
        if (arr.length == 0) {
            System.err.println("Zero length");
            throw new RuntimeException("Zero length");
        }
        Arrays.stream(arr).sorted();
        if (arr.length % 2 == 0) {
            return (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
        }
        return arr[arr.length/2];
    }
}

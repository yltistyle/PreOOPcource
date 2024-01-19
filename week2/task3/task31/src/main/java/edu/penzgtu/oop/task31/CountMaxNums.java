package edu.penzgtu.oop.task31;

public class CountMaxNums {
    public static void main( String[] args ) {
        CountMaxNums  print = new CountMaxNums ();

        double[] arr = {34, 34, 50, 50, 50, 1};
        System.out.println(print.countMax(arr));
    }
    int countMax(double[] arr) {
        int count = 0;
        double max = -Double.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count = 1;
            } else if (max == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
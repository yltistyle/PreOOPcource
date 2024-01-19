package edu.penzgtu.oop.task23;

import java.util.Arrays;

public class PrimeNumberGenerator {
    public static void main( String[] args ) {
        int num = 33;
        System.out.println("Num " + num + "\n" + Arrays.toString(PrimeNumberGenerator.generatePrimeNumbers(num)));
    }

    static int[] generatePrimeNumbers(int value) {
        int[] arr = new int[value + 1];
        int count = 0;

        for (int i = 2; i <= value; ++i) {
            arr[i] = i;
        }

        for (int i = 2; i <= value; ++i) {
            if (arr[i] != 0) {
                int j = i + i;
                while (j <= value) {
                    arr[j] = 0;
                    j += i;
                }
                count++;
            }
        }
        int[] res = new int[count];
        int index = 0;

        for (int k = 2; k <= value; k++) {
            if (arr[k] != 0) {
                res[index++] = arr[k];
            }
        }

        return res;
    }
}
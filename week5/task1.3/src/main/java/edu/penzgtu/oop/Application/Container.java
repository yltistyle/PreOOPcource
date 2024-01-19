package edu.penzgtu.oop.Application;

import java.util.ArrayList;
import java.util.Arrays;

public class Container {
    public static void main( String[] args ) {
        ArrayList<Integer> lines = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(lines + "\nresult: " + largeContainer(lines));
    }

    private static int largeContainer(ArrayList<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height.get(left), height.get(right));
            int water = width * h;
            maxWater = Math.max(maxWater, water);
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}

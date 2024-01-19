package edu.penzgtu.oop.task13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Counters {

    public static void main( String[] args ) {
        String input = "3744@4946@9950@98-1@97-50@0113@";
        System.out.printf("%s\n%s", input, parseString(input, 0));
        System.out.printf("%s\n%s", input, parseString(input, 1));
    }

    static String parseString(String str, int value) {
        if (!matchesAll(str, RegexpException.REGEXP)) {
            try {
                throw new RegexpException("Invalid String", str);
            } catch (RegexpException e) {
                System.out.println(e.getMessage());
            }
        } else if (value != 0 && value != 1) {
            throw new InputMismatchException("Invalid int value: only 0 or 1");
        }
    return print(sortIdTemp(str, value));
    }
    static String print(double[][] arrays) {
        String result = "";
        for (double[] arr: arrays) {
            result += (int)arr[0] + " " + arr[1] + "\n";
        }
        return result;
    }
    static double[][] sortIdTemp(String string, int value) {
        String[] strings = string.split("@+");
        double[][] forSort = new double[strings.length][2];

        for (int i = 0; i < strings.length; i++) {
            forSort[i][0] = Double.parseDouble(strings[i].substring(0, 2));
            forSort[i][1] = Double.parseDouble(strings[i].substring(2));
        }
        Arrays.sort(forSort, Comparator.comparingDouble(o -> o[value]));
        return forSort;
    }
    static boolean matchesAll(String string, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher match = pattern.matcher(string);
        return match.matches();
    }
}

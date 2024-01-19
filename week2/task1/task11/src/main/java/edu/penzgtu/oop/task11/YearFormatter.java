package edu.penzgtu.oop.task11;

public class YearFormatter {
    public static void main(String[] args) {
        YearFormatter formatter = new YearFormatter();

        for (int i = 0; i < 50; i++) {
            System.out.println(i + formatter.formatYears(i));
        }
    }
    String formatYears(int value) {
        String result = "";
        int mod = value % 10;
        int mod100 = value % 100;

        if (mod100 > 10 && mod100 < 15) {
            result += " лет";
        } else if (mod == 1) {
            result += " год";
        } else if (mod == 0 || (mod >= 5 && mod <= 9)) {
            result += " лет";
        } else if (mod >= 2 && mod <= 4) {
            result += " года";
        } else {
            result += " лет";
        }

        return result;
    }
}

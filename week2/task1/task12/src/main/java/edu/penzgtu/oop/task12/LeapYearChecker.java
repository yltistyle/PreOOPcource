package edu.penzgtu.oop.task12;

public class LeapYearChecker {
    public static void main(String[] args) {
        LeapYearChecker checker = new LeapYearChecker();

        for (int year = 0; year < 2024; year++) {
            if (checker.isLeapYear(year)) {
                System.out.println(year + " - Год високосный");
            } else {
                System.out.println(year + " - Год не високосный");
            }
        }
    }
    boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }
}

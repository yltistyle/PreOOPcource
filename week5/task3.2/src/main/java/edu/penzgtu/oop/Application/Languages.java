package edu.penzgtu.oop.Application;

import java.util.*;

public class Languages {
    public static void main( String[] args ) {
        print(
            "3\n" +
            "3\n" +
            "Russian\n" +
            "English\n" +
            "Japanese\n" +
            "2\n" +
            "Russian\n" +
            "English\n" +
            "1\n" +
            "English"
            );
    }

    private static void print(String strings) {
        Map<Integer, Set<String>> map = parseString(strings);
        if (!map.get(1).isEmpty()) {
            System.out.println(map.get(1).size() + ":");
            for (String commonLanguage: sortStrings(map.get(1))) {
                System.out.println(commonLanguage);
            }
        } else {System.out.println("there is no common language");}
        System.out.println(map.get(3).size() + ":");
        for (String studentLanguage: sortStrings(map.get(3))) {
            System.out.println(studentLanguage);
        }
    }
    private static Map<Integer, Set<String>> parseString(String strings) {

        Map<Integer, Set<String>> isBetter = new HashMap<>();
        isBetter.put(1, new HashSet<String>()); // commonSet
        isBetter.put(2, new HashSet<String>()); // dynSet
        isBetter.put(3, new HashSet<String>()); // betterStudent
        strings = strings.substring(2)+"\n0";

        for (String s: strings.split("\\n")) {
            if (s.matches("\\d+")) {
                if (!isBetter.get(1).isEmpty()) {
                    isBetter.put(1, commonSet(isBetter.get(1), isBetter.get(2)));
                } else {
                    isBetter.put(1, commonSet(isBetter.get(2), isBetter.get(2)));
                }
                if (isBetter.get(3).size() < isBetter.get(2).size()) {
                    isBetter.put(3, isBetter.get(2));
                }
                isBetter.put(2, new HashSet<String>());
            } else {isBetter.get(2).add(s);}
        }
        return isBetter;
    }

    private static Set<String> commonSet(Set<String> one, Set<String> two) {
        if (one.size() > two.size()) {
            return commonSet(two, one);
        }
        for (String s: one) {
            if (!two.contains(s)) {one.remove(s);}
        }
        return one;
    }

    private static ArrayList<String> sortStrings(Set<String> set) {
        ArrayList<String> list = new ArrayList<>(set);
        list.subList(1, list.size());
        Collections.sort(list);
        return list;
    }
}
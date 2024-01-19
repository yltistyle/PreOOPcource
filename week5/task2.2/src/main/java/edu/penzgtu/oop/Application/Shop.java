package edu.penzgtu.oop.Application;

import java.util.*;

public class Shop {
    public static void main( String[] args ) {
        print(
                "Ivanov paper 10\n" +
                "Petrov pens 5\n" +
                "Ivanov marker 3\n" +
                "Ivanov paper 7\n" +
                "Petrov envelope 20\n" +
                "Ivanov envelope 5"
        );
    }

    private static void print(String strings) {
        Map<String, Map<String, Integer>> processed = parseString(strings);
        for (String human: sortStrings(processed.keySet())) {
            System.out.println(human + ":");
            for (String product: sortStrings(processed.get(human).keySet())) {
                System.out.println(product + " " + processed.get(human).get(product));
            }
        }
    }

    private static Map<String, Map<String, Integer>> parseString(String strings) {
        Map<String, Map<String, Integer>> result = new HashMap<>();

        for (String s: strings.split("\\n")) {
            String key = s.replaceAll("\\s.+", "");
            if (!result.containsKey(key)) {
                Map<String, Integer> now = new HashMap<>();
                result.put(key, now);
            }
            int value = 0;
            String secKey = s.replaceAll(key+" ", "")
                             .replaceAll("\\s\\d+", "");
            if (result.get(key).containsKey(secKey)) {value = result.get(key).get(secKey);}
            value += Integer.parseInt(s.replaceAll("\\D+", ""));
            result.get(key).put(secKey, value);
        }
        return result;
    }

    private static ArrayList<String> sortStrings(Set<String> strings) {
        ArrayList<String> list = new ArrayList<>(strings);
        list.subList(1, list.size());
        Collections.sort(list);
        return list;
    }
}

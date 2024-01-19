package edu.penzgtu.oop.Application;

import java.util.*;

public class Dictionary {
    public static void main( String[] args ) {
        print(
                "3\n" +
                "apple - malum, pomum, popula\n" +
                "fruit - baca, bacca, popum\n" +
                "punishment - malum, multa"
             );
    }
    private static void print(String strings) {
        Map<String, Set<String>> map = parseString(strings);
        System.out.println(map.size());

        for (String k: sortKeys(map.keySet())) {
            System.out.println(k + " - " + map.get(k).toString().replaceAll("(\\[|\\])", ""));
        }
    }
    private static ArrayList<String> sortKeys(Set<String> keys) {
        ArrayList<String> sortedKeys = new ArrayList<>(keys);
        sortedKeys.subList(1, sortedKeys.size());
        Collections.sort(sortedKeys);
        return sortedKeys;
    }
    private static Map<String, Set<String>> parseString(String strings) {
        Map<String, Set<String>> result = new HashMap<>();
        strings = strings.substring(2);
        for (String s: strings.split("\\n")) {
            for (String key: s.replaceAll(".+\\s-\\s", "").split(",\\s")) {
                String value = s.replaceAll("\\s-\\s.+", "");
                if (!result.containsKey(key)) {
                    Set<String> now = new HashSet<>();
                    now.add(value);
                    result.put(key, now);
                }
                result.get(key).add(value);
            }
        }

        return result;
    }
}

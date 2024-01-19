package edu.penzgtu.Application;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main( String[] args ) {
        String string = "Abracadabra";
        System.out.println(string + "\nresult: " + maxCountSymbol(string));
    }
    
    private static Map<String, Integer> maxCountSymbol(String string) {
        short[] map = new short[256];
        int max = -1;
        char symbol = '-';

        for (char c: string.toCharArray()) {
            map[c]++;
            if (map[c] > max) {
                max = map[c];
                symbol = c;
            }
        }
        Map<String, Integer> mp = new HashMap<>();
        mp.put(String.valueOf(symbol), max);
        return mp;
    }
}

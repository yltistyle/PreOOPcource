package edu.penzgtu.oop.task13;

import java.util.HashMap;
import java.util.Map;

public class Badminton {
    public static void main(String[] args) {
        Badminton obj = new Badminton();
        Map<String, String> conditions = new HashMap<>();

        conditions.put("day", "sunday");
        conditions.put("temperature", "warm");
        conditions.put("precipitation", "clear");
        conditions.put("wind", "false");
        conditions.put("humidity", "low");

        if (obj.shouldPlayBadminton(conditions)) {
            System.out.println("Go play Badminton");
        } else {
            System.out.println("Sofa");
        }
    }

    boolean shouldPlayBadminton(Map<String, String> conditions) {
        String validConditions = "sundaywarmcloudyfalsecloudylowhightclear";
        String[] keys = {"day", "temperature", "precipitation", "wind", "humidity"};

        for (String key : keys) {
            if (!conditions.containsKey(key)) {
                System.err.println("Invalid Map<String, String> (the key does not exist)");
                throw new RuntimeException("Invalid Map<String, String> (the key does not exist)");
            }

            if (!validConditions.contains(conditions.get(key))) {
                return false;
            }
        }

        return true;
    }
}

package com.tripillar_coding_assignments.module8;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        String input = "Disappear";

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }


        System.out.println("Character frequencies in '" + input + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

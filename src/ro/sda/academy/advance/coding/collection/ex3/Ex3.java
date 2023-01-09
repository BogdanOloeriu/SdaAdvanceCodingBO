package ro.sda.academy.advance.coding.collection.ex3;

import java.util.*;

/**
 * Create a method that takes the map as a parameter, where the key is string and the value number, and then prints each map
 * element to the console in the format: Key: , Value: . There should be a comma at the end of every line except the last,
 * and a period at the last. Example:
 * Key: Java, Value: 18,
 * Key: Python, Value: 1,
 * …
 * Key: PHP, Value: 0.
 */

public class Ex3 {

    public static void main(String[] args) {

        Map<String,Integer> mapList = new HashMap<>();
        mapList.put("Java",18);
        mapList.put("Python",1);
        mapList.put("PHP",0);

        MapReturningElements(mapList);

    }


    public static void MapReturningElements(Map<String, Integer> inputMap) {

        String endValue;

        Set<Map.Entry<String, Integer>> entrySet = inputMap.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);

        for (int i = 0; i < entryList.size(); i++) {
            if (i < entryList.size() - 1) {
                endValue = ",";
            } else {
                endValue = ".";
            }
            System.out.println("Key: " + entryList.get(i).getKey() + ", Value: " + entryList.get(i).getValue() + endValue);
        }

    }
}

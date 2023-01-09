package practice.exercises.ex21;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Java", 18);
        stringIntegerMap.put("Python", 1);
        stringIntegerMap.put("PHP", 0);

        printMapValue(stringIntegerMap);


    }

    public static void printMapValue(Map<String, Integer> stringMap) {

        Set<Map.Entry<String, Integer>> entrySet = stringMap.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        for (int i = 0; i < entryList.size(); i++) {
            String parameter;
            if (i < entryList.size() - 1) {
                parameter = ",";
            } else {
                parameter = ".";
            }
            System.out.println("Key: " + entryList.get(i).getKey() + parameter + " Value: " + entryList.get(i).getValue() + parameter);
        }

    }
}

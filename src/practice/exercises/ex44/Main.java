package practice.exercises.ex44;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> inputMap = new HashMap<>();
        inputMap.put("Java",18);
        inputMap.put("Python",1);
        inputMap.put("PHP",0);

        printMapContent(inputMap);

    }

    public static void printMapContent(Map<String, Integer> inputMap) {

        Set<Map.Entry<String, Integer>> entrySet = inputMap.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        for (int i = 0; i < entryList.size(); i++) {
            String operator;
            if (i < entryList.size() - 1) {
                operator = ",";
            } else {
                operator = ".";
            }
            System.out.println("Key: " + entryList.get(i).getKey() + ", Value: " +
                    entryList.get(i).getValue() + operator);
        }
    }
}

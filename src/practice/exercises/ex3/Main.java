package practice.exercises.ex3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Java",18);
        stringIntegerMap.put("Python",1);
        stringIntegerMap.put("PHP",0);

        printMapContent(stringIntegerMap);

        Set<String> stringSet = stringIntegerMap.keySet();
        System.out.println(stringSet);

        Collection<Integer> values = stringIntegerMap.values();
        System.out.println(values);

        Set<Map.Entry<String,Integer>> entrySet = stringIntegerMap.entrySet();

    }

    public static void printMapContent (Map<String,Integer> inputMap){

        Set<Map.Entry<String,Integer>> entrySet = inputMap.entrySet();
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
        for ( int i =0; i< entryList.size(); i ++){
            String endOfLine;
            if(i < entryList.size() - 1){
                endOfLine = ",";
            }else {
                endOfLine = ".";
            }
            System.out.println("Key: " + entryList.get(i).getKey() + endOfLine + " Value: " + entryList.get(i).getValue() + endOfLine);
        }
    }
}

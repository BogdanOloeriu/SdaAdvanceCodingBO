package practice.exercises.ex43;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Java", 18);
        stringIntegerMap.put("Python", 1);
        stringIntegerMap.put("PHP", 0);

        getPrintMap(stringIntegerMap);
    }

    public static void getPrintMap(Map<String,Integer> inputMapContent){

        Set<Map.Entry<String,Integer>> entrySet = inputMapContent.entrySet();
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
        for(int i = 0; i< entryList.size(); i++){
            String operator = "";
            if(i < entryList.size() - 1){
                operator = ",";
            }else{
                operator = ".";
            }
            System.out.println("Key: " + entryList.get(i).getKey() + operator + " Value: " + entryList.get(i).getValue() + operator);
        }
    }
}

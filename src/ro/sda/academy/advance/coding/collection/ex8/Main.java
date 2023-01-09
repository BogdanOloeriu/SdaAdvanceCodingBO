package ro.sda.academy.advance.coding.collection.ex8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,Integer> entryMap = new HashMap<>();
        entryMap.put("Java",18);
        entryMap.put("Python",1);
        entryMap.put("PHP",0);

        printMapContent(entryMap);
    }

    public static void printMapContent(Map<String,Integer> inputMap){

        Set<Map.Entry<String,Integer>> setContent = inputMap.entrySet();
        List<Map.Entry<String,Integer>> listContent = new ArrayList<>(setContent);
        for(int i = 0; i< listContent.size();i++){
            String separator = "";
            if(i < listContent.size() - 1){
                separator =",";
            }else {
                separator = ".";
            }
            System.out.println("Key: " + listContent.get(i).getKey() + ", Value: " + listContent.get(i).getValue() + separator);
        }
    }
}

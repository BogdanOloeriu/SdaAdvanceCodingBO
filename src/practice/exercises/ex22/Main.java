package practice.exercises.ex22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(getCharacterPosition("helloWorld"));

    }

    public static Map<String, List<Integer>> getCharacterPosition(String input){

        Map<String,List<Integer>> positionMap = new HashMap<>();
        for(int i =0 ; i< input.toCharArray().length; i++){
            String currentChar = input.toCharArray()[i] +"";
            if(positionMap.containsKey(currentChar)){
                List<Integer> positionList = positionMap.get(currentChar);
                positionList.add(i);
                positionMap.put(currentChar,positionList);
            }else{
                List<Integer> positionList = new ArrayList<>();
                positionList.add(i);
                positionMap.put(currentChar,positionList);
            }
        }
        return positionMap;
    }
}

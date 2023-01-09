package ro.sda.academy.advance.coding.collection.ex9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(getCharactersPosition("helloWorld"));

    }

    public static Map<String, List<Integer>> getCharactersPosition(String character){

        Map<String,List<Integer>> positionByChar = new HashMap<>();

        for(int i = 0; i < character.toCharArray().length ; i++){
            String currentChar = character.toCharArray()[i] + "";
            if(positionByChar.containsKey(currentChar)){
                List<Integer> positionList = positionByChar.get(currentChar);
                positionList.add(i);
                positionByChar.put(currentChar,positionList);
            }else{
                List<Integer> positionList = new ArrayList<>();
                positionList.add(i);
                positionByChar.put(currentChar,positionList);
            }
        }
        return positionByChar;
    }
}

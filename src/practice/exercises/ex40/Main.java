package practice.exercises.ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(getCharacterPosition("helloWorld"));

    }

    public static Map<Character, List<Integer>> getCharacterPosition(String input){

        Map<Character,List<Integer>> positionByChar = new HashMap<>();
        for(int i = 0; i < input.toCharArray().length;i++){
            Character currentChar = input.toCharArray()[i];
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

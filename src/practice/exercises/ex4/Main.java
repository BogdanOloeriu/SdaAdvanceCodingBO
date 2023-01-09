package practice.exercises.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String check = "helloWorld";

        System.out.println(getCharacterPosition(check));

    }

    public static Map<Character, List<Integer>> getCharacterPosition (String input){

        Map<Character,List<Integer>> positionByChar = new HashMap<>();

        for(int i = 0; i< input.toCharArray().length;i++){
            char currentCharacter = input.toCharArray()[i];
            if(positionByChar.containsKey(currentCharacter)){
                List<Integer> positionList = positionByChar.get(currentCharacter);
                positionList.add(i);
                positionByChar.put(currentCharacter,positionList);
            }else{
                List<Integer> positionList = new ArrayList<>();
                positionList.add(i);
                positionByChar.put(currentCharacter,positionList);
            }
        }
        return positionByChar;
    }
}

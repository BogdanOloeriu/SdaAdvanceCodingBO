package practice.exercises.ex45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(getCharactersConcordance("helloWorld"));
    }

    public static Map<Character, List<Integer>> getCharactersConcordance(String input){

        Map<Character,List<Integer>> positionByChar = new HashMap<>();

        for(int i = 0; i < input.toCharArray().length;i++){
            Character currentChar = input.toCharArray()[i];
            if(positionByChar.containsKey(currentChar)){
                List<Integer> inputList = positionByChar.get(currentChar);
                inputList.add(i);
                positionByChar.put(currentChar,inputList);
            }else{
                List<Integer> inputList = new ArrayList<>();
                inputList.add(i);
                positionByChar.put(currentChar,inputList);
            }
        }
        return positionByChar;
    }
}

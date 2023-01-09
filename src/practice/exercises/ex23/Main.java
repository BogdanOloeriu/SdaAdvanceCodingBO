package practice.exercises.ex23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println(getCharacterNumber("helloWorld"));

    }

    public static Map<Character, List<Integer>> getCharacterNumber(String input) {

        Map<Character, List<Integer>> characterMap = new HashMap<>();
        for (int i = 0; i < input.toCharArray().length; i++) {
            char currentChar = input.toCharArray()[i];
            if (characterMap.containsKey(currentChar)) {
                List<Integer> positionList = characterMap.get(currentChar);
                positionList.add(i);
                characterMap.put(currentChar, positionList);
            }else{
                List<Integer> positionList = new ArrayList<>();
                positionList.add(i);
                characterMap.put(currentChar,positionList);
            }
        }
        return characterMap;
    }
}

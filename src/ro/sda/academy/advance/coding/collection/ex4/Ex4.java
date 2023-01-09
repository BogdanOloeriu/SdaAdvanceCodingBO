package ro.sda.academy.advance.coding.collection.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ex 4
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

public class Ex4 {

    public static void main(String[] args) {

        System.out.println(getCharactersPositions("ABCD"));
        System.out.println(getCharactersPositions("helloWorld"));

    }

    public static Map<Character, List<Integer>> getCharactersPositions(String input) {

        Map<Character,List<Integer>> positionByChar = new HashMap<>();

        for(int i = 0;i< input.toCharArray().length; i++){

            char currentChar = input.toCharArray()[i];
            if(positionByChar.containsKey(currentChar)){
                List<Integer> positionList = positionByChar.get(currentChar);
                positionList.add(i);
                positionByChar.put(currentChar,positionList);
            }else{
                List<Integer> integersList = new ArrayList<>();
                integersList.add(i);
                positionByChar.put(currentChar,integersList);
            }
        }

        return positionByChar;

    }
}

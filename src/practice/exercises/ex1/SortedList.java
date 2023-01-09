package practice.exercises.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {

    public static void main(String[] args) {

        List<Integer> sortedList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sortedList(sortedList));

        List<String> stringList = Arrays.asList("ANA","bogdan","Andrei","MIHAI");
        System.out.println(sortListIgnoreCase(stringList));

    }

    public static List<Integer> sortedList(List<Integer> inputList){

        return inputList.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());

    }

    public static List<String> sortListIgnoreCase ( List<String> inputList){

        return inputList.stream()
                .sorted(((o1, o2) -> o2.compareToIgnoreCase(o1)))
                .collect(Collectors.toList());
    }




}

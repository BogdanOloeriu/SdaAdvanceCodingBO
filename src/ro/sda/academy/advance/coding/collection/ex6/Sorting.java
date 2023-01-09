package ro.sda.academy.advance.coding.collection.ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        System.out.println(sortedList(list));

    }

    public static List<Integer> sortedList(List<Integer> inputList){
        return inputList.stream()
                .sorted(((o1, o2) -> {
                    return o2.compareTo(o1);
                }))
                .collect(Collectors.toList());
    }
}

package ro.sda.academy.advance.coding.collection.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class integerSortedList {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        System.out.println("Sorted list from z to a is:");
        System.out.println(integerSortedList(numberList));


    }

    public static List<Integer> integerSortedList(List<Integer> inputList){

        List<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(inputList);

        sortedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        return sortedList;
    }
}

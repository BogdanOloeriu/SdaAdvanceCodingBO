package ro.sda.academy.advance.coding.collection.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Ex 1 - Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A.
 */

public class SortedList {

    public static void main(String[] args) {

        List<String> inputList = new ArrayList<>();
        inputList.add("Bogdan");
        inputList.add("Andrei");
        inputList.add("Mihai");
        inputList.add("Andreea");

        System.out.println("Sorting list from Z to A is: ");
        System.out.println(sorting(inputList));

    }


    public static List<String> sorting(List<String> inputList){

        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(inputList);

        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        return sortedList;

    }
}

package ro.sda.academy.advance.coding.collection.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedListCaseSensitive {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        nameList.add("Bogdan");
        nameList.add("MIHAI");
        nameList.add("marica");
        nameList.add("Ionel");

        System.out.println("Sorted list is: ");
        System.out.println(sortedListCaseSensitive(nameList));


    }

    public static List<String> sortedListCaseSensitive(List<String> inputList){

        List<String> sortedList = new ArrayList<>();

        sortedList.addAll(inputList);

        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        });

        return sortedList;
    }
}

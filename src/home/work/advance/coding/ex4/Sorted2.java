package home.work.advance.coding.ex4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorted2 {

    public static void main(String[] args) {


    }

    public static List<String> sortedList(List<String> inputList){

        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(inputList);

        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        return sortedList;
    }
}

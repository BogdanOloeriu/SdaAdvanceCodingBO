package home.work.advance.coding.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Compare {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        compareList(integerList);

        System.out.println(compareList(integerList));


    }

    public static List<Integer> compareList(List<Integer> inputList){

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

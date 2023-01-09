package ro.sda.academy.advance.coding.collection.ex7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedCaseInsesitive {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaaa","BSADAS","JOHN","Andrew");

        System.out.println(sortedMethod(list));

    }

    public static List<String> sortedMethod(List<String> inputList){
        return inputList.stream()
                .sorted(((o1, o2) -> {
                    return o2.compareToIgnoreCase(o1);
                }))
                .collect(Collectors.toList());
    }
}

package practice.exercises.ex42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(Main.getListSorted(integers));


    }

    public static List<Integer> getListSorted(List<Integer> list){
        return list.stream()
                .sorted((s1,s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }
}

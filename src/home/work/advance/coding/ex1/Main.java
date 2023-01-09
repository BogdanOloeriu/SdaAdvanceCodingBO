package home.work.advance.coding.ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> randomList = new ArrayList<>(100);
        Random randomNumber = new Random();
        for (int i = 0; i < 100; i++) {

            randomList.add(randomNumber.nextInt(100));

        }
        System.out.println(randomList);

        List<Integer> distinctList = new ArrayList<>();
        distinctList.addAll(randomList);

        System.out.println("Distinct list:");
        System.out.println(distinctList(distinctList));

        System.out.println("--------------------");
        System.out.println("Duplicate list:");
        System.out.println(repeatParameterOfList(randomList));
    }

    public static List<Integer> distinctList(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Set<Integer> repeatParameterOfList(List<Integer> parameterList){
        Set<Integer> duplicate = new HashSet<>();
        return parameterList.stream()
                .filter(n -> duplicate.add(n))
                .collect(Collectors.toSet());
    }
}

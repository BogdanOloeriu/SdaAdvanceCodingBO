package ro.sda.academy.advance.coding.oop.ex8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Joiner<Integer> integerJoiner = new Joiner<>("-");

        System.out.println(integerJoiner.join(Arrays.asList(1,2,3,4,5,6)));

        Joiner<String> joinerString = new Joiner<>("=");
        System.out.println(joinerString.join(Arrays.asList("ABCDE","EWRSADA","GFDSGSD")));
    }
}

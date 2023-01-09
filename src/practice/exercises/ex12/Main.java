package practice.exercises.ex12;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Joiner<Integer> integerJoiner = new Joiner<>("-");

        System.out.println(integerJoiner.join(Arrays.asList(1,2,3,4)));

    }
}

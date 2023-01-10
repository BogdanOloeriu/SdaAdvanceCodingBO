package practice.exercises.ex59;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>("-");
        System.out.println(joiner.join(Arrays.asList(1,2,3,4)));
    }
}

package practice.exercises.ex37;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>("-");
        System.out.println(joiner.join(Arrays.asList(1,2,3,4)));

        Joiner<String> joiner1 = new Joiner<>("-");
        System.out.println(joiner1.join(Arrays.asList("Ana","are","Mere")));
    }
}

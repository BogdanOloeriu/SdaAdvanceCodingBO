package practice.exercises.ex48;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer,Integer> inputMap = new TreeMap<>();
        inputMap.put(1,1);
        inputMap.put(2,2);
        inputMap.put(3,3);
        inputMap.put(4,4);

        displayFirstAndLast(inputMap);

    }

    public static void displayFirstAndLast(TreeMap<Integer,Integer> inputTreeMap){
        System.out.println("First Entry is: " + inputTreeMap.firstEntry());
        System.out.println("Last entry is: " + inputTreeMap.lastEntry());
    }
}

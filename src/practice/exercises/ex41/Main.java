package practice.exercises.ex41;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<String,String> treeMap = new TreeMap<>((s1,s2) -> s1.compareTo(s2));
        treeMap.put("Bmw","X6");
        treeMap.put("Mercedes","glc");
        treeMap.put("Audi","Q5");
        printFastAndLast(treeMap);


    }

    public static void printFastAndLast(TreeMap<String,String> treeMap){
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());
    }
}

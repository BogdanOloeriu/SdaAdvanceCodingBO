package ro.sda.academy.advance.coding.collection.ex12;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<String,String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        treeMap.put("Bogdan","123446");
        treeMap.put("Andreea","567898");

        firstInLastOut(treeMap);

    }

    public static void firstInLastOut(TreeMap<String,String> inputMap){
        System.out.println("Fist element: " + inputMap.firstEntry());
        System.out.println("Last element: " + inputMap.lastEntry());
    }
}

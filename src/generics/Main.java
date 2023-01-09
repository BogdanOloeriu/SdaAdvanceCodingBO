package generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        elements.add(5);
//        elements.add("123456");

        try {
            printElementsOfArrayList(elements);
        }catch (ClassCastException e){
            e.printStackTrace();
        }

    }


    public static void printElementsOfArrayList(ArrayList element){
        for(Object el : element){
            System.out.println((Integer) el * 2);
        }
    }
}

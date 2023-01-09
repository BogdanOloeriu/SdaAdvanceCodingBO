package homework.advance.coding.task8;

import practice.exercises.ex38.SdaArrayList;

public class Main {

    public static void main(String[] args) {

        SdaArrayList<String> sdaArrayList = new SdaArrayList<>();
        sdaArrayList.add("a");
        sdaArrayList.add("b");
        sdaArrayList.add("c");
        sdaArrayList.add("d");
        sdaArrayList.add("e");

        try{
            System.out.println(sdaArrayList.getEveryNthElement(0,10));
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
}

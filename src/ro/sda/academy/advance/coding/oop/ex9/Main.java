package ro.sda.academy.advance.coding.oop.ex9;

public class Main {

    public static void main(String[] args) {

        SdaArrayList<String> stringSdaArrayList = new SdaArrayList<>();
        stringSdaArrayList.add("a");
        stringSdaArrayList.add("b");
        stringSdaArrayList.add("c");
        stringSdaArrayList.add("d");
        stringSdaArrayList.add("e");
        stringSdaArrayList.add("f");
        stringSdaArrayList.add("g");

        System.out.println(stringSdaArrayList.getEveryNthElement(2, 1));

        try {
            System.out.println(stringSdaArrayList.getEveryNthElement(-1, 3));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(stringSdaArrayList.getEveryNthElement(1, 1));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

}

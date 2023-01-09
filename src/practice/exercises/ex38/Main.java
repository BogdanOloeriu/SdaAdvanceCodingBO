package practice.exercises.ex38;

public class Main {

    public static void main(String[] args) {


        SdaArrayList<String> sdaArrayList = new SdaArrayList<>();
        sdaArrayList.add("a");
        sdaArrayList.add("b");
        sdaArrayList.add("c");
        sdaArrayList.add("d");
        sdaArrayList.add("e");
        sdaArrayList.add("f");
        sdaArrayList.add("g");

        try{
            System.out.println(sdaArrayList.getEveryNthElement(1,3));
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
}

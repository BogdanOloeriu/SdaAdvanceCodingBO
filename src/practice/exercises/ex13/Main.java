package practice.exercises.ex13;

public class Main {

    public static void main(String[] args) {


        SDAArrayList<String> stringsList = new SDAArrayList<>();
        stringsList.add("a");
        stringsList.add("b");
        stringsList.add("c");
        stringsList.add("d");
        stringsList.add("e");
        stringsList.add("f");

        System.out.println( stringsList.joinList(2,1));
    }
}

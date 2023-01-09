package practice.exercises.ex28;

public class Main {

    public static void main(String[] args) {


        Car bmw = new Car("BMW",
                "x3",
                "black",
                new Engine("BMW","V6"));

        System.out.println(bmw.getEngine().getName());
    }
}

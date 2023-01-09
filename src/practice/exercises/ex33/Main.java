package practice.exercises.ex33;

public class Main {

    public static void main(String[] args) {

        System.out.println("Price for Ferrari is: " + Car.FERRARI.getPrice());

        System.out.println("Porsche is faster than Bmw: " + Car.PORSCHE.isFasterThan(Car.BMW));
    }
}

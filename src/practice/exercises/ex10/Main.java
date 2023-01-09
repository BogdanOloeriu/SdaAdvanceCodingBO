package practice.exercises.ex10;

public class Main {


    public static void main(String[] args) {

        System.out.println("Price for the ferrari is: " + Car.FERRARI.getPrice());
        System.out.println("Ferrari is regular car: " + Car.FERRARI.isRegular());
        System.out.println("Ferrari is faster then Porsche: " + Car.FERRARI.isFaster(Car.PORSCHE));

    }
}

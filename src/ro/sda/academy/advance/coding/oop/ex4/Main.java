package ro.sda.academy.advance.coding.oop.ex4;

public class Main {

    public static void main(String[] args) {

        System.out.println("Price for Ferrari is: " + Car.FERRARI.getPrice());

        System.out.println("Ferrari is regular: " + Car.FERRARI.isRegular());

        System.out.println("Ferrari is faster then : " + Car.FERRARI.isFasterThen(Car.PORSCHE));
    }
}

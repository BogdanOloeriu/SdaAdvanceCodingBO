package ro.sda.academy.advance.coding.oop.ex5;

public class Main {

    public static void main(String[] args) {

        Qube qube = new Qube(10);
        System.out.println("Perimeter is: " + qube.calculatePerimeter());
        System.out.println("Area is: " + qube.calculateArea());
        System.out.println("Volume is: " + qube.calculateVolume());

        qube.fill(200000);
        qube.fill(10);
    }
}

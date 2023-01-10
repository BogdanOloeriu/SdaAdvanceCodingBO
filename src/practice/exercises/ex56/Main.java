package practice.exercises.ex56;

public class Main {

    public static void main(String[] args) {

        Qube qube = new Qube(10);
        System.out.println("Area: " + qube.calculateArea());
        System.out.println("Perimeter: " + qube.calculatePerimeter());
        System.out.println("Volume: " + qube.calculateVolume());
        qube.fill(100);
        qube.fill(200000);

    }
}

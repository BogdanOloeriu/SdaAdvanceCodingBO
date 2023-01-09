package practice.exercises.ex34;

public class Main {

    public static void main(String[] args) {

        Shape3D qube = new Qube(100);
        System.out.println("Perimeter: " + qube.calculatePerimeter());
        System.out.println("Area: " + qube.calculateArea());
        System.out.println("Volume: " + qube.calculateVolume());

        qube.fill(200);
        qube.fill(100000000);
    }
}

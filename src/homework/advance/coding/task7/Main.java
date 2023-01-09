package homework.advance.coding.task7;

public class Main {

    public static void main(String[] args) {

        Qube qube = new Qube(10);

        qube.fill(20);
        qube.fill(3000);

        System.out.println("Area: " + qube.calculateArea());
    }
}

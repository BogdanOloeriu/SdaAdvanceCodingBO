package design.patterns.factory.pattern.ex1;

public class Main {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.create("circle");
        circle.draw();

        Shape rectangle = factory.create("rectangle");
        rectangle.draw();
    }
}

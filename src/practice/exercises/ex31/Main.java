package practice.exercises.ex31;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Point2D point2D1 = new Point2D(10,5);
        Point2D point2D2 = new Point2D(5,5);

        Circle circle = new Circle(point2D1,point2D2);
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Perimeter is: " + circle.getPerimeter());
        System.out.println("Area is: " + circle.getArea());

        circle.move(new MoveDirection(3,2));
        System.out.println("--------------------");
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Perimeter is: " + circle.getPerimeter());
        System.out.println("Area is: " + circle.getArea());

        Point2D x = new Point2D(3,5);
        Point2D y = new Point2D(1,2);
        Point2D z = new Point2D(4,7);
        Point2D k = new Point2D(1,10);

        Rectangle rectangle = new Rectangle(x,y,z,k);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(rectangle);

        shapeList.stream()
                .forEach(shape -> shape.move(new MoveDirection(1,5)));

        System.out.println("=======================");

        shapeList.stream()
                .forEach(shape -> {
                    System.out.println(shape.getArea());
                    System.out.println("---------------");
                    System.out.println(shape.getPerimeter());
                });
    }
}

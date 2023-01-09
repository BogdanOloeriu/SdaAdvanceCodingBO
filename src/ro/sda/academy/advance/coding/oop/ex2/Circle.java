package ro.sda.academy.advance.coding.oop.ex2;

/**
 * Then create a Circle class
 * that will have a constructor:
 * Circle(Point2D center, Point2D point)
 *  The first parameter specifies the center of the circle, the second is any point on the circle. Based on these points,
 *  the Circle class is to determine:
 * • circle radius when calling double getRadius() method
 * • circle circumference when calling double getPerimeter() method
 * • circle area when calling double getArea() method
 */

public class Circle implements Movable,Resizable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double direction) {
        point.move(new MoveDirection(point.getX()*direction,point.getY()*direction));
    }

    public double getRadius(){
        return Math.sqrt(Math.pow(point.getY() - center.getY(),2) + Math.pow(point.getX() - center.getX(),2));
    }

    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }

    public double getArea(){
        return Math.PI * Math.pow(getRadius(),2);
    }

    public Point2D getCenter() {
        return center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }
}

package ro.sda.academy.advance.coding.oop.ex2;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Create a Point2D class with fields double x, double y, getters, setters and constructor. Then create a Circle class
 * that will have a constructor:
 * Circle(Point2D center, Point2D point)
 *  The first parameter specifies the center of the circle, the second is any point on the circle. Based on these points,
 *  the Circle class is to determine:
 * • circle radius when calling double getRadius() method
 * • circle circumference when calling double getPerimeter() method
 * • circle area when calling double getArea() method
 */

public class Point2D implements Movable {

    private double x;
    private double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x = this.x + moveDirection.getX();
        this.y = this.y + moveDirection.getY();
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

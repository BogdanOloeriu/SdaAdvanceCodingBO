package ro.sda.academy.advance.coding.oop.ex2;

/**
 * Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
 * Create a Movable interface with the move(MoveDirection moveDirection) method.
 * Implement the interface in the classes from the previous task (Point2D and Circle).
 * When the move(MoveDirection moveDirection) method is called, the objects are to change their position based on the provided direction (MoveDirection).
 * Validate the offset by calling the other Circle methods.
 * <p>
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle). When calling the resize(double resizeFactor) method,
 * the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */

public class MoveDirection {

    private double x;
    private double y;

    public MoveDirection(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MoveDirection{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

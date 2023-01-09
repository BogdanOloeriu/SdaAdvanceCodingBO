package practice.exercises.ex34;

public class Qube extends Shape3D{

    private double length;

    public Qube(double length) {
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 12*length;
    }

    @Override
    public double calculateArea() {
        return 6*Math.pow(length,2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(length,3);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Qube{" +
                "length=" + length +
                '}';
    }
}

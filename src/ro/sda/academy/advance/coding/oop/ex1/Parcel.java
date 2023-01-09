package ro.sda.academy.advance.coding.oop.ex1;

import java.util.Objects;

/**
 * Implement the Validator interface, which will include a boolean validate(Parcel input) method in its declaration.
 * Create a Parcel class with the parameters:
 * • int xLength
 * • int yLength
 * • int zLength
 * • float weight
 * • boolean isExpress
 * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300,
 * whether each size is not less than 30,
 * whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true.
 * In case of errors, it should inform the user about them.
 */

public class Parcel {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "xLength=" + xLength +
                ", yLength=" + yLength +
                ", zLength=" + zLength +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parcel)) return false;
        Parcel parcel = (Parcel) o;
        return xLength == parcel.xLength && yLength == parcel.yLength && zLength == parcel.zLength && Float.compare(parcel.weight, weight) == 0 && isExpress == parcel.isExpress;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLength, yLength, zLength, weight, isExpress);
    }
}

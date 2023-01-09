package ro.sda.academy.advance.coding.oop.ex1;


import java.util.function.Predicate;

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

public class ParcelValidator implements Predicate<Parcel> {

    @Override
    public boolean test(Parcel parcel) {
        double sum = parcel.getxLength() + parcel.getyLength() + parcel.getzLength();
        if (sum > 300) {
            System.out.println("Sum exceed 30!");
            return false;
        }
        if (parcel.getxLength() < 30) {
            System.out.println("xLength is less then 30");
            return false;
        }
        if (parcel.getyLength() < 30) {
            System.out.println("yLength is less then 30");
            return false;
        }
        if (parcel.getzLength() < 30) {
            System.out.println("zLength is less then 30");
            return false;
        }
        if (parcel.getWeight() > 15 && parcel.isExpress()) {
            System.out.println("Weight is greater then 15");
            return false;
        }
        if (parcel.getWeight() > 30 && !parcel.isExpress()) {
            System.out.println("Weight is greater then 30");
            return false;
        }
        return true;
    }
}

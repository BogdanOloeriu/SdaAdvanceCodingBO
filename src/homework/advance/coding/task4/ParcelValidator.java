package homework.advance.coding.task4;

import java.util.function.Predicate;

/**
 * * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300,
 * * whether each size is not less than 30,
 * * whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true.
 * * In case of errors, it should inform the user about them.
 */

public class ParcelValidator implements Predicate<Parcel> {

    @Override
    public boolean test(Parcel parcel) {
        int sum = parcel.getHeight() + parcel.getLength() + parcel.getWidth();
        if(sum > 300){
            System.out.println("Sum of dimensions exceed 300!");
            return false;
        }
        if(parcel.getHeight() < 30){
            System.out.println("Height is less then 30!");
            return false;
        }
        if(parcel.getLength() < 30){
            System.out.println("Length is less than 30!");
            return false;
        }
        if(parcel.getWidth() < 30){
            System.out.println("Width is less than 30!");
            return false;
        }
        if(parcel.getExpress().equals(false) && parcel.getWeight() < 30){
            System.out.println("Weight does not exceed 30!");
            return false;
        }
        if(parcel.getExpress().equals(true) && parcel.getWeight() < 15){
            System.out.println("The wight does not exceed 15!");
            return false;
        }
        return true;
    }
}

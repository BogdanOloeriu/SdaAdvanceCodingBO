package practice.exercises.ex30;

import java.util.function.Predicate;

public class ParcelValidator implements Predicate<Parcel> {

    @Override
    public boolean test(Parcel parcel) {
        int sum = parcel.getHeight() + parcel.getLength() + parcel.getWidth();
        if (sum > 300) {
            System.out.println("The sum of dimension exceed 300!");
            return false;
        }
        if (parcel.getWeight() > 15 && parcel.isExpress()) {
            System.out.println("The wight exceed 15!");
            return false;
        }
        if (!parcel.isExpress() && parcel.getWeight() > 30) {
            System.out.println("The weight exceed 30!");
            return false;
        }
        if (parcel.getHeight() < 30) {
            System.out.println("The height of the package is less then 30!");
            return false;
        }
        if (parcel.getLength() < 30) {
            System.out.println("The length of the package is less then 30!");
            return false;
        }
        if (parcel.getWidth() < 30) {
            System.out.println("The width of the package is less then 30!");
            return false;
        }
        return true;
    }
}

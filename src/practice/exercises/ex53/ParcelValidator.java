package practice.exercises.ex53;

import java.util.function.Predicate;

public class ParcelValidator implements Predicate<Parcel> {


    @Override
    public boolean test(Parcel parcel) {
        double sum = parcel.getHeight() + parcel.getLength() + parcel.getWidth();
        if(sum > 300){
            System.out.println("The sum of dimesion exceed 300!");
            return false;
        }
        if(parcel.getHeight() < 30){
            System.out.println("The height is less than 30!");
            return false;
        }
        if(parcel.getLength() < 30){
            System.out.println("The height is less than 30!");
            return false;
        }
        if(parcel.getWidth() < 30){
            System.out.println("The width is less than 30!");
            return false;
        }
        if(parcel.getWeight() < 30){
            System.out.println("the weight is less than 30!");
            return false;
        }
        if(parcel.getWeight() <30 && parcel.isExpress()){
            System.out.println("The wight does not exceed 30!");
            return false;
        }
        if(parcel.getWeight() < 15 && !parcel.isExpress()){
            System.out.println("The weight does not exceed 15!");
            return false;
        }
        return true;
    }
}

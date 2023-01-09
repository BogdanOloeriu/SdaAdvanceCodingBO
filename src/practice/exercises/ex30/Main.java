package practice.exercises.ex30;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Parcel> parcelList = new ArrayList<>();
        parcelList.add(new Parcel(31,32,40,29,false));
        parcelList.add(new Parcel(40,32,45,14,true));
        parcelList.add(new Parcel(38,30,45,16,true));
        parcelList.add(new Parcel(45,31,31,32,false));
        parcelList.add(new Parcel(31,15,100,10,false));
        parcelList.add(new Parcel(32,200,100,10,false));

        parcelList.stream()
                .filter(new ParcelValidator())
                .forEach(parcel -> System.out.println(parcel));
    }
}

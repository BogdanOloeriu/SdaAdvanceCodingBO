package practice.exercises.ex53;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Parcel> parcels = new ArrayList<>();
        parcels.add(new Parcel(31,32,40,29,false));
        parcels.add(new Parcel(40,32,45,14,true));
        parcels.add(new Parcel(38,30,45,16,true));
        parcels.add(new Parcel(45,31,31,32,false));
        parcels.add(new Parcel(31,15,100,10,false));
        parcels.add(new Parcel(32,200,100,10,false));

        parcels.stream()
                .filter(new ParcelValidator())
                .forEach(parcel -> System.out.println(parcel));
    }
}

package ro.sda.academy.advance.coding.collection.ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rating rating = new Rating();
        rating.addRating(1);
        rating.addRating(2);
        rating.addRating(3);
        rating.addRating(2);

        System.out.println(rating.ratingMethod());


    }
}

package practice.exercises.ex6;

import ro.sda.academy.advance.coding.collection.ex11.Rating;

public class Main {

    public static void main(String[] args) {

        ProductRating productRating = new ProductRating("Numbers");
        productRating.addRating(1);
        productRating.addRating(5);
        productRating.addRating(10);
        productRating.addRating(25);
        productRating.addRating(3);

        System.out.println("rating with stream is: " + productRating.averageStream());

        System.out.println("Rating normal is: " + productRating.average());

    }
}

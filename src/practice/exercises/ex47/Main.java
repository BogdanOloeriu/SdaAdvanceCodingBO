package practice.exercises.ex47;

public class Main {

    public static void main(String[] args) {

        ProductRating rating = new ProductRating("Football");
        rating.addRating(2.0);
        rating.addRating(4.5);
        rating.addRating(6.0);
        rating.addRating(3.3);

        System.out.println("Display rating: " + rating.displayRating());
    }
}

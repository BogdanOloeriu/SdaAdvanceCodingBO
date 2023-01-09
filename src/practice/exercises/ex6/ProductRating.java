package practice.exercises.ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRating {

    private final String name;
    private final List<Integer> ratingList = new ArrayList<>();

    public ProductRating(String name) {
        this.name = name;
    }

    public void addRating(int rating){
        if(rating >= 1 && rating <= 6){
            ratingList.add(rating);
        }else {
            System.out.println("Invalid rating: " + rating);
        }
    }

    public double average(){
        if(ratingList.size() == 0){
            return 0;
        }
            double sum = 0;
            for(Integer rating: ratingList){
                sum = sum + rating;
            }
        return sum/ratingList.size();
    }

    public double averageStream(){
        return ratingList.stream().collect(Collectors.averagingDouble(ratingList -> ratingList));
    }
}

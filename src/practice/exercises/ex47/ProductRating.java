package practice.exercises.ex47;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRating {

    private String name;
    private final List<Double> ratingList = new ArrayList<>();

    public ProductRating(String name){
        this.name = name;
    }

    public void addRating(Double rating){
        if(rating >=1 && rating <= 6){
            ratingList.add(rating);
        }else{
            System.out.println("The rating is not valid: " + rating);
        }
    }

    public Double displayRating(){
        return ratingList.stream()
                .collect(Collectors.averagingDouble(ratingList -> ratingList));
    }
}

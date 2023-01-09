package ro.sda.academy.advance.coding.collection.ex11;

import java.util.ArrayList;
import java.util.List;

public class Rating {

    private final List<Integer> ratingList = new ArrayList<>();



    public void addRating(int rating){
        if(rating >= 1 && rating <= 6){
            ratingList.add(rating);
        }else {
            throw new RuntimeException("Invalid rating!");
        }
    }

    public double ratingMethod(){
        if(ratingList.size() == 0){
            return 0;
        }
            double sum = 0;
            for(Integer rating : ratingList){
                sum = sum + rating;

        }
        return sum/ratingList.size();
    }
}

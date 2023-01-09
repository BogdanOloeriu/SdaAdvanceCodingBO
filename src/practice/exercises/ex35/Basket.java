package practice.exercises.ex35;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<String> basketList =new ArrayList<>();
    private int maxSize;

    public Basket(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addToTheBasket(String product){
        if(basketList.size() < maxSize){
            basketList.add(product);
        }else{
            throw new BasketFullException("Basket is full: " + basketList.size());
        }
    }

    public void removeFromTheBasket(String product){
        if(!basketList.isEmpty()){
            basketList.remove(product);
        }else{
            throw new BasketEmptyException("Basket is empty!");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketList=" + basketList +
                ", maxSize=" + maxSize +
                '}';
    }
}

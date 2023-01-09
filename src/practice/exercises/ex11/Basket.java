package practice.exercises.ex11;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<String> basketList = new ArrayList<>();
    private final int maxSize;

    public Basket(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addToTheBasket(String product){
        if(basketList.size() < maxSize){
            basketList.add(product);
        }else {
            throw new BasketFullException("Basket is full " + maxSize);
        }
    }

    public void removeFromBasket(String productToRemove) throws BasketEmptyException{
        if(!basketList.isEmpty()){
            basketList.remove(productToRemove);
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

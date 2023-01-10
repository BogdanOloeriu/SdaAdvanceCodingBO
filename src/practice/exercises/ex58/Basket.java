package practice.exercises.ex58;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<String> basket = new ArrayList<>();
    private int maxSize;

    public Basket(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addToTheBasket(String product) throws BasketFullException {
        if(basket.size() < maxSize){
            basket.add(product);
        }else{
            throw new BasketFullException("Basket is full!");
        }
    }

    public void removeFromTheBasket(String product) throws BasketEmptyException {
        if(!basket.isEmpty()){
            basket.remove(product);
        }else{
            throw new BasketEmptyException("Basket is empty!");
        }
    }

    public List<String> getBasket() {
        return basket;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                ", maxSize=" + maxSize +
                '}';
    }
}

package practice.exercises.ex36;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<String> basketList = new ArrayList<>();
    private int maxSize;

    public Basket(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addToTheBasket(String product) throws BasketFullException {
        if(basketList.size() < maxSize){
            basketList.add(product);
        }else{
            throw new BasketFullException("Basket is full!");
        }
    }

    public void removeFromTheBasket(String product) throws BasketEmptyException {
        if(!basketList.isEmpty()){
            basketList.remove(product);
        }else{
            throw new BasketEmptyException("Basket is empty!");
        }
    }

    public List<String> getBasketList() {
        return basketList;
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
                "basketList=" + basketList +
                ", maxSize=" + maxSize +
                '}';
    }
}

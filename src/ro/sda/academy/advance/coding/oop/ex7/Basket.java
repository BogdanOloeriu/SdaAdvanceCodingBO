package ro.sda.academy.advance.coding.oop.ex7;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<String> list = new ArrayList<>();

    private final int maxSize;

    public Basket(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addToTheBasket(String product) throws BasketFullException {
        if(list.size() < maxSize){
            list.add(product);
        }else{
            throw new BasketFullException("Basket is full: " + maxSize);
        }
    }

    public void removeFromBasket(String productToRemove) throws BasketEmptyException {
        if(!list.isEmpty()){
            list.remove(productToRemove);
        }else{
            throw new BasketEmptyException("Basket is empty!");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "list=" + list +
                ", maxSize=" + maxSize +
                '}';
    }
}


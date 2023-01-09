package practice.exercises.ex11;

public class Main {

    public static void main(String[] args) {

        try {
            Basket basket = new Basket(2);
            basket.addToTheBasket("Meat");
            basket.addToTheBasket("Meat");
            basket.addToTheBasket("Meat");
        }catch (BasketFullException e){
            e.printStackTrace();
        }

        try {
            Basket basket = new Basket(2);
            basket.removeFromBasket("Meat");
        }catch (BasketEmptyException e){
            e.printStackTrace();
        }
    }
}

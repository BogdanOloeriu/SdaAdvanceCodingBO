package practice.exercises.ex58;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket(2);

        try {
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
        }catch (BasketFullException e){
            System.out.println(e.getMessage());
        }
    }
}

package practice.exercises.ex57;

public class Main {
    public static void main(String[] args) {

        Basket basket = new Basket(4);

        try {
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
        }catch (BasketFullException e){
            System.out.println(e.getMessage());
        }
    }
}

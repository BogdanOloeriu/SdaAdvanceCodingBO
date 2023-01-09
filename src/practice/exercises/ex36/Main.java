package practice.exercises.ex36;

public class Main {


    public static void main(String[] args) {

        try{
            Basket basket = new Basket(2);
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
            basket.addToTheBasket("a");
        }catch (BasketFullException e){
            System.out.println(e.getMessage());
        }


        try{
            Basket basket = new Basket(1);
            basket.removeFromTheBasket("a");
        }catch (BasketEmptyException e){
            System.out.println(e.getMessage());
        }
    }
}

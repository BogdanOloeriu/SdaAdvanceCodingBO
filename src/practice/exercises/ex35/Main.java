package practice.exercises.ex35;

public class Main {

    public static void main(String[] args) {


        try {
            Basket basket = new Basket(5);
            basket.addToTheBasket("e");
            basket.addToTheBasket("e");
            basket.addToTheBasket("e");
            basket.addToTheBasket("e");
            basket.addToTheBasket("e");
            basket.addToTheBasket("e");
        }catch (BasketFullException e){
            System.out.println(e.getMessage());
        }

        try {
            Basket basket2 = new Basket(1);
            basket2.removeFromTheBasket("e");
        }catch (BasketEmptyException e){
            System.out.println(e.getMessage());
        }


    }
}

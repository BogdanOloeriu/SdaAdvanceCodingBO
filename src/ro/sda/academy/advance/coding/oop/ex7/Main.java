package ro.sda.academy.advance.coding.oop.ex7;

public class Main {

    public static void main(String[] args) {


        try{
            Basket store = new Basket(10);

            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
            store.addToTheBasket("Milk");
        }catch (BasketFullException e){
            System.out.println(e.getMessage());
        }

        try {
            Basket basket1 = new Basket(2);
            basket1.removeFromBasket("Milk");
        }catch (BasketEmptyException e){
            System.out.println(e.getMessage());
        }

    }
}

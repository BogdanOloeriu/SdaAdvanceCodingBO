package home.work.advance.coding.generics.comparable;

public class Main {

    public static void main(String[] args) {


        Car car = new Car("BMW","X3",45_000,500);
        Car audi = new Car("Audi","Q5",40_000,550);

        System.out.println(car.compareTo(audi));
    }
}

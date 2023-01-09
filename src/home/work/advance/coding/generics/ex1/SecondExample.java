package home.work.advance.coding.generics.ex1;

public class SecondExample {

    public static void main(String[] args) {

        Garage<Car> garage = new Garage<>();
        garage.putInside(new BMW());
        System.out.println(garage.getObjectInside());
    }
}

class Garage<T extends Car> {

    private T objectInside;

    public void putInside(T objectInside){
        this.objectInside = objectInside;
    }

    public T getObjectInside() {
        return objectInside;
    }

}

class Car{

    private String name;
    private String model;
    private int price;

    public Car(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

class Audi extends Car{

    public Audi() {
        super("Audi","A6",20_000);
    }
}

class BMW extends Car{

    public BMW() {
        super( "BMW","X3",45_000);
    }
}

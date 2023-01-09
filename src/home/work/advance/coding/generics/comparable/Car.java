package home.work.advance.coding.generics.comparable;

public class Car implements Comparable<Car> {

    private String name;
    private String model;
    private int price;
    private int horsePower;

    public Car(String name, String model, int price, int horsePower) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.horsePower = horsePower;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", horsePower=" + horsePower +
                '}';
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.horsePower,otherCar.getHorsePower());
    }
}

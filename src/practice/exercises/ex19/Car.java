package practice.exercises.ex19;

public class Car implements Comparable<Car>{

    private String name;
    private String model;
    private String color;
    private Integer price;
    private Engine engine;

    public Car(String name, String model, String color, Integer price, Engine engine) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(engine.getHorsePower(),otherCar.getEngine().getHorsePower());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }
}

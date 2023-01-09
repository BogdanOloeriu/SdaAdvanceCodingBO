package homework.advance.coding.task5;

import java.util.List;
import java.util.Objects;

/**
 * * Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer),
 *  * and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3).
 *  * Include all necessary methods and constructor parameters.
 *  * Implement the hashcode() and equals() methods
 */

public class Car {

    private String name;
    private String model;
    private  int price;
    private int yearOfManufacturer;
    private List<Manufacturer> manufacturerList;
    private Engine engine;

    public Car(String name, String model, int price, int yearOfManufacturer, List<Manufacturer> manufacturerList, Engine engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacturer = yearOfManufacturer;
        this.manufacturerList = manufacturerList;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacturer=" + yearOfManufacturer +
                ", manufacturerList=" + manufacturerList +
                ", engine=" + engine +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacturer == car.yearOfManufacturer && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacturer, manufacturerList, engine);
    }
}

package practice.exercises.ex32;

import org.omg.CORBA.PRIVATE_MEMBER;
import practice.exercises.ex28.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Car {

    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturerList;

    private EngineType engineType;

    public Car(String name, String model, int price, int yearOfManufacture, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public Car(String name, String model, int price, int yearOfManufacture) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<String> getManufacturerName(){
        return manufacturerList.stream()
                .map(manufacturer -> manufacturer.getName())
                .collect(Collectors.toList());
    }

    public List<Integer> getManufacturerEstablishmentYear(){
        return manufacturerList.stream()
                .map(manufacturer -> manufacturer.getYearOfEstablishment())
                .collect(Collectors.toList());
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
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

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturerList=" + manufacturerList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList, engineType);
    }
}

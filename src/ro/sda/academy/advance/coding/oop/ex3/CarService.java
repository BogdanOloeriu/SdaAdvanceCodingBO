package ro.sda.academy.advance.coding.oop.ex3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car,
 * 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
 */

public class CarService {

    private final Set<Car> carSet = new HashSet<>();

    public void addCar(Car car) {
        carSet.add(car);
    }

    public void removeCar(Car car) {
        carSet.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(carSet);
    }

    public List<Car> getV12Cars() {
        List<Car> v12CarList = new ArrayList<>();
        for (Car car : carSet) {
            if (car.getEngine() == Engine.V12) {
                v12CarList.add(car);
            }
        }
        return v12CarList;
    }

    public List<Car> getAllCarsBefore1999() {
        return carSet.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : carSet) {
            if (mostExpensiveCar == null || mostExpensiveCar.getPrice() < car.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Optional<Car> getMostExpensiveCarStream() {
        return carSet.stream()
                .max(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));
    }

    public Optional<Car> getCheapestCar() {
        return carSet.stream()
                .min(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));
    }

    public List<Car> getCarsWithMinimum3Manufacturer() {
        return carSet.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> sortedCars(Boolean ascending){
        return carSet.stream()
                .sorted((o1, o2) -> {
                    if(ascending){
                        return Double.compare(o1.getPrice(),o2.getPrice());
                    }else{
                        return Double.compare(o2.getPrice(),o1.getPrice());
                    }
                })
                .collect(Collectors.toList());
    }

    public boolean containsCar(Car car){
        return carSet.contains(car);
    }

    public List<Car> getCarByManufacturer(Manufacturer manufacturer){
        return carSet.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWhichContainsManufactureWithEstablishment(String operator, int year){
        return carSet.stream()
                .filter(car -> {
                    switch (operator){
                        case(">"):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year);
                        default:
                            throw new RuntimeException("Invalid operator" + operator);
                    }
                })

                .collect(Collectors.toList());
    }
}

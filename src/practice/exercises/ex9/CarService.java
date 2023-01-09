package practice.exercises.ex9;

import ro.sda.academy.advance.coding.oop.ex3.Manufacturer;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {


    private final Set<Car> carList = new HashSet<>(); // nu l dau in constructor ca sa nu umble nimeni la lista mea de masini

    public void addCars(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        if (!carList.isEmpty()) {
            carList.remove(car);
        } else {
            throw new RuntimeException("There are no cars in the Service!");
        }
    }

    public void addCars(List<Car> inputCarList) {
        carList.addAll(inputCarList);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(carList);
    }

    public List<Car> getCarsWithV12Engine(){
        return carList.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsBefore1999(){
        return carList.stream()
                .filter(car -> car.getYearOfManufacturer() < 1999)
                .collect(Collectors.toList());
    }

    public Optional<Car> getMostExpensiveCar(){
        return carList.stream()
                .max(((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())));
    }

    public Optional<Car> getMostCheapestCar(){
        return carList.stream()
                .min((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    }

    public List<Car> carWith3Manufactures(){
        return carList.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsSorted( Boolean ascending){
        return carList.stream()
                .sorted(((o1, o2) -> {
                    if (ascending){
                        return Double.compare(o1.getPrice(), o2.getPrice());
                    }else {
                        return Double.compare(o2.getPrice(), o1.getPrice());
                    }
                }))
                .collect(Collectors.toList());
    }

    public boolean checkASpecificCar(Car car){
        return carList.contains(car);
    }

    public List<Car> getCarsManufacturedByASpecific(Manufacturer manufacturer){
        return carList.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWhichContainsManufactureWithEstablishment(String operator, int year){
        return carList.stream()
                .filter(car -> {
                    switch (operator){
                        case (">"):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year);
                        case ("<"):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() < year);
                        case (">="):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() >= year);
                        case ("<="):
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() <= year);
                        default:
                            throw new IllegalStateException("Invalid operator " + operator);
                    }
                })
                .collect(Collectors.toList());
    }

    public List<String> getAllModels(){
        return carList.stream()
                .map(car -> car.getModel())
                .distinct()
                .collect(Collectors.toList());
    }
}

package practice.exercises.ex54;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> cars = new ArrayList<>();


    public void addCar(Car car){
        if(!cars.contains(car)){
            cars.add(car);
        }else{
            System.out.println("Car already exists in the service!");
        }
    }

    private void removeCar(Car car){
        if(cars.contains(car)){
            cars.remove(car);
        }else {
            System.out.println("Car does not exist in the service!");
        }
    }

    public List<Car> getAllCars(){
        return new ArrayList<>(cars);
    }

    public List<Car> getAllCarsWithV12(){
        return cars.stream()
                .filter(car -> car.getEngine().equals(Engine.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore1999(){
        return cars.stream()
                .filter(car -> car.getYearOfManufacturer() < 1999)
                .collect(Collectors.toList());
    }

    public Optional<Car> getMostExpensiveCar(){
        return cars.stream()
                .max((car1,car2) -> Double.compare(car1.getPrice(),car2.getPrice()));
    }

    public Optional<Car> getMostCheapestCar(){
        return cars.stream()
                .min((car1,car2) -> Double.compare(car1.getPrice(),car2.getPrice()));
    }

    public List<Car> getCarsWithAtLeast3Manufacturer(){
        return cars.stream()
                .filter(car -> car.getManufacturerList().size() >3)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsSortedByParameter(Boolean ascending){
        return cars.stream()
                .sorted((car1,car2) -> {
                    if(ascending){
                        return Double.compare(car1.getPrice(),car2.getPrice());
                    }else{
                        return Double.compare(car2.getPrice(),car1.getPrice());
                    }
                })
                .collect(Collectors.toList());
    }

    public Boolean checkACar(Car car){
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer){
        return cars.stream()
                .filter(car -> car.getManufacturerList().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsBySymbolAndYear(String character, int year){
        return cars.stream()
                .filter(car -> {
                    switch (character){
                        case (">"):
                            car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year);
                        default:
                            throw new IllegalStateException("Invalid operator: " + character);
                    }
                })
                .collect(Collectors.toList());
    }
 }

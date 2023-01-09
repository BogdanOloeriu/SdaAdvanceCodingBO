package practice.exercises.ex32;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {

    private final Set<Car> cars = new HashSet<>();

    public void addCar(Car car){
        cars.add(car);
    }

    public void addCars(List<Car> carList){
        cars.addAll(carList);
    }

    public void removeACarFromTheService(Car car){
        if(cars.contains(car)){
            cars.remove(car);
        }else{
            System.err.println("Car: " + car.getName() + " is not present in the list!");
        }
    }

    public List<Car> getAllCars(){
        return new ArrayList<>(cars);
    }

    public List<Car> carsWithV12Engine(){
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }

    public List<Car> carProducedBefore1999(){
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
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
                .filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> getSortedCarsByParameter(Boolean ascending){
        if(ascending){
            return cars.stream()
                    .sorted((car1,car2) -> Double.compare(car1.getPrice(),car2.getPrice()))
                    .collect(Collectors.toList());
        }else{
            return cars.stream()
                    .sorted((car1,car2) -> Double.compare(car2.getPrice(),car1.getPrice()))
                    .collect(Collectors.toList());
        }
    }

    public Boolean checkCar(Car car){
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer){
        return cars.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car>  getCarsWhichContainsManufactureWithEstablishment(String operator, int year){
        return cars.stream()
                .filter(car -> {
                    switch (operator){
                        case (">"):
                            car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year);
                        default:
                            throw new IllegalStateException("Invalid operator " + operator);
                    }
                })
                .collect(Collectors.toList());
    }

    public Set<String> getAllModels(){
      return cars.stream()
              .map(car -> car.getModel())
              .collect(Collectors.toSet());
    }

    public List<String> displayAllCars(){
        return cars.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList());
    }


    public List<String> getManufacturerName(){
        return cars.stream()
                .map(car -> car.getModel())
                .collect(Collectors.toList());
    }

    public List<Integer> getYearOfProduction(){
        return cars.stream()
                .map(car -> car.getYearOfManufacture())
                .collect(Collectors.toList());
    }

    public List<String> getAllCarsName(){
        return cars.stream()
                .map(car -> car.getName())
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWithAnEvenYearOfFoundation(){
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWithEvenYearOfModelProductionAndOddYearOfEstablishing(){
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() % 2 == 0)
                .filter(car -> {
                    return car.getManufacturerList().stream()
                            .filter(manufacturer -> manufacturer.getYearOfEstablishment() % 2 != 0)
                            .allMatch(manufacturer -> manufacturer.getYearOfEstablishment() % 2 != 0);
                })
                .collect(Collectors.toList());
    }


}

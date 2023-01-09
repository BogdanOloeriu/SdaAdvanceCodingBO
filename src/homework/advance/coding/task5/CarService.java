package homework.advance.coding.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    private final List<Car> carList = new ArrayList<>();

    public void addCar(Car car){
        if(!carList.contains(car)){
            carList.add(car);
        }else{
            System.out.println("Car already exists in the service!");
        }
    }

    public void removeCar(Car car){
        if(carList.contains(car)){
            carList.remove(car);
        }else{
            System.out.println("Service empty!");
        }
    }

    public List<Car> getAllCars(){
        return new ArrayList<>(carList);
    }

    public List<Car> getCarsWithV12Engine(){
        return carList.stream()
                .filter(car -> car.getEngine().equals(Engine.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getCarProducedBefore1999(){
        return carList.stream()
                .filter(car -> car.getYearOfManufacturer() < 1999)
                .collect(Collectors.toList());
    }

    public Optional<Car> getMostExpensiveCar(){
        return carList.stream()
                .max((ca1,car2) -> Double.compare(ca1.getPrice(),car2.getPrice()));
    }

    public Optional<Car> getCheapestCar(){
        return carList.stream()
                .min((car1,car2) -> Double.compare(car1.getPrice(),car2.getPrice()));
    }

    public List<Car> getCarsWithAtLeast3Manufacturer(){
        return carList.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> getSortedCar(boolean isAscending){
        return carList.stream()
                .sorted((car1,car2) -> {
                    if(isAscending){
                        return Double.compare(car1.getPrice(),car2.getPrice());
                    }else{
                        return Double.compare(car2.getPrice(),car1.getPrice());
                    }
                })
                .collect(Collectors.toList());
    }

    public Boolean checkCar(Car car){
        return carList.contains(car);
    }

    public List<Car> getCarsByASpecificManufacturer(Manufacturer manufacturer){
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
                        default:
                            throw new IllegalStateException("Invalid operator!");
                    }
                })
                .collect(Collectors.toList());
    }
}

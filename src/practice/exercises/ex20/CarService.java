package practice.exercises.ex20;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> carServiceList = new ArrayList<>();

    public void addCar(Car car){
        if(carServiceList.contains(car)){
            throw new EmptyCarListException("Car already exist in the service!");
        }else {
            carServiceList.add(car);
        }
    }

    public void removeCar(Car car){
        if(carServiceList.isEmpty()){
            throw new EmptyCarListException("Car service is empty!");
        }else {
            carServiceList.remove(car);
        }
    }

    public List<Car> getAllCarsFromService(){
        return new ArrayList<>(carServiceList);
    }

    public List<Car> getCarsWithV12Engine(){
        return carServiceList.stream()
                .filter(car -> car.getEngine().equals(Engine.V12))
                .collect(Collectors.toList());
    }

    public List<Car> getCarProduceBefore1999(){
        return carServiceList
                .stream()
                .filter(car -> car.getYearOfManufacturer() < 1999)
                .collect(Collectors.toList());
    }

    public Optional<Car> getMostExpensiveCar(){
        return carServiceList
                .stream()
                .max((car,car2) -> Double.compare(car.getPrice(),car2.getPrice()));
    }

    public Optional<Car> getCheapestCar(){
        return carServiceList
                .stream()
                .min((car1,car2) -> Double.compare(car1.getPrice(),car2.getPrice()));
    }

    public List<Car> getTheCarsWithAtLeast3Manufacturer(){
        return carServiceList
                .stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> getSortedCars (String parameter){
        return carServiceList
                .stream()
                .sorted((ca1,car2) -> {
                    if(parameter.equals("ascending")){
                        return Double.compare(ca1.getPrice(),car2.getPrice());
                    }else{
                        return Double.compare(car2.getPrice(),ca1.getPrice());
                    }
                })
                .collect(Collectors.toList());
    }

    public boolean checkIfACarIsInTheService(Car car){
        if(carServiceList.contains(car)){
            return true;
        }else{
            return false;
        }
    }

    public List<Car> getListOfCarsByManufacturer(Manufacturer manufacturer){
        return carServiceList
                .stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());

    }

    public List<Car> getCarsWhichContainsManufactureWithEstablishment(String operator, int year){
        return carServiceList
                .stream()
                .filter(car -> {
                    switch (operator){
                        case ">":
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year);
                        default:
                            throw new IllegalStateException("Invalid operator: " + operator);
                    }
                })
                .collect(Collectors.toList());
    }
}

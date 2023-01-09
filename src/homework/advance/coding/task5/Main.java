package homework.advance.coding.task5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CarService carService = new CarService();
        Manufacturer manufacturer1 = new Manufacturer("Bmw",2020,"Germany");
        Manufacturer manufacturer2 = new Manufacturer("Audi",1990,"Germany");
        Manufacturer manufacturer3 = new Manufacturer("Mercedes",2005,"Germany");

        Car bmw = new Car("BMW","X3",45_000,2021, Arrays.asList(manufacturer1),Engine.V12);
        Car audi = new Car("Audi","Q5",43_000,2020,Arrays.asList(manufacturer2),Engine.S6);
        Car mercedes = new Car("Mercedes","GLC",55_000,2023,Arrays.asList(manufacturer3),Engine.V12);

        carService.addCar(bmw);
        carService.addCar(audi);
        carService.addCar(mercedes);

        System.out.println(carService.getCarProducedBefore1999());

        System.out.println(carService.getCarsWithV12Engine());
    }
}

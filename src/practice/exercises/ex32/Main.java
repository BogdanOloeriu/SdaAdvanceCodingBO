package practice.exercises.ex32;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        CarService carService = new CarService();
        Manufacturer manufacturer1 = new Manufacturer("Audi",1998,"Germany");
        Manufacturer manufacturer2  = new Manufacturer("Audi",1970,"Romania");
        Manufacturer manufacturer3  = new Manufacturer("Audi",1999,"England");
        Manufacturer manufacturer4  = new Manufacturer("BMW",2005,"England");
        Manufacturer manufacturer5  = new Manufacturer("BMW",1600,"France");

        Car audi = new Car(
                "A4",
                "break",
                20_000,
                1998,
                Arrays.asList(manufacturer1,manufacturer2,manufacturer3),
                EngineType.V12
        );
        carService.addCar(audi);

        Car bmw = new Car(
                "M8",
                "Sport",
                35000,
                2018,
                Arrays.asList(manufacturer4,manufacturer5),
                EngineType.V8
        );
        carService.addCar(bmw);

        Car bmw2 = new Car(
                "M6",
                "Sport",
                40000,
                2019,
                Arrays.asList(manufacturer4,manufacturer5),
                EngineType.V6
        );
        carService.addCar(bmw2);

        System.out.println("All car in the service: " + carService.getAllCars());

        System.out.println("All cars with v12 engine: " + carService.carsWithV12Engine());

        Car car4 = new Car(
                "A4",
                "break",
                20000,
                1998,
                Arrays.asList(manufacturer1,manufacturer2,manufacturer3), //ar trebuie sa mearga si cu List.of pt versiuni mai noi
                EngineType.V12
        );

        System.out.println("Check if car4 exist in carService: " + carService.checkCar(car4));

        System.out.println("+++++++++++++++++++++++++++++");

        System.out.println(carService.getManufacturerName());

        System.out.println("++++++++++++++++++++++");
        System.out.println(carService.getCarsWithAnEvenYearOfFoundation());

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(carService.getCarsWithEvenYearOfModelProductionAndOddYearOfEstablishing());
    }


}

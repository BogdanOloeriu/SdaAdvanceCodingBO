package practice.exercises.ex9;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        CarService service = new CarService();
        Manufacturer manufacturer1 = new Manufacturer("Audi",1998,"Germany");
        Manufacturer manufacturer2 = new Manufacturer("BMW",1970,"England");
        Manufacturer manufacturer3 = new Manufacturer("Dacia",2000,"Romania");
        Manufacturer manufacturer4 = new Manufacturer("Mercedes",1996,"Germany");
        Manufacturer manufacturer5 = new Manufacturer("Audi",1600,"Germany");

        Car car1 = new Car(
                "A4",
                "break",
                20_000,
                1998,
                Arrays.asList(manufacturer1,manufacturer5),
                EngineType.V12
        );

        service.addCars(car1);

        Car car2 = new Car(
                "X3",
                "SUV",
                35_000,
                2018,
                Arrays.asList(manufacturer2),
                EngineType.V8
        );

        service.addCars(car2);

        Car car3 = new Car(
                "Duster",
                "SUV",
                20_000,
                2020,
                Arrays.asList(manufacturer3),
                EngineType.V6
        );

        service.addCars(car3);

        Car car4 = new Car(
                "Cclas",
                "sedan",
                40_000,
                2021,
                Arrays.asList(manufacturer4),
                EngineType.V8
        );

        service.addCars(car4);

        System.out.println("All the cars in the service: " + service.getAllCars());

        System.out.println("-----------------------------------");
        System.out.println("All the cars with V12 Engine: " + service.getCarsWithV12Engine());

        System.out.println("----------------------------------");
        System.out.println("All cars produced before 1999" + service.getCarsBefore1999());

        System.out.println("------------------------------------");
        System.out.println("The most expensive car : " + service.getMostExpensiveCar());

        System.out.println("-------------------------------------");
        System.out.println("The cheapest car in the service is: " + service.getMostCheapestCar());

        Car car5 = new Car(
                "Cclas",
                "sedan",
                40_000,
                2021,
                Arrays.asList(manufacturer4),
                EngineType.V8
        );

        System.out.println("---------------------------");
        System.out.println("Check if the car5 is in the service: " + service.checkASpecificCar(car5));




    }




}

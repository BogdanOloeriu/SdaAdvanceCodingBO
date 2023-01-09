package practice.exercises.ex20;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        CarService service = new CarService();
        Manufacturer manufacturer1  = new Manufacturer("Audi",1998,"Germany");
        Manufacturer manufacturer2  = new Manufacturer("Audi",1970,"Romania");
        Manufacturer manufacturer3  = new Manufacturer("Audi",1999,"England");
        Manufacturer manufacturer4  = new Manufacturer("BMW",2005,"England");
        Manufacturer manufacturer5  = new Manufacturer("BMW",1600,"France");

        Car bmw = new Car("Bmw","X3",40_000,2020,
                Arrays.asList(manufacturer4,manufacturer5),Engine.V12);

        service.addCar(bmw);

        Car audi = new Car("audi","Q5",45_000,2022,
                Arrays.asList(manufacturer1,manufacturer2),Engine.S6);

        service.addCar(audi);

        System.out.println(service.getAllCarsFromService());
    }
}

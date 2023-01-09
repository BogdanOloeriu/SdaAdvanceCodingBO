package practice.exercises.ex19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car BMW = new Car("BMW","X3","Black",30_000,
                new Engine("v8", 400, "6000"));

        Car audi = new Car("Audi","Q5","Black",25_000,
                new Engine("V6",350,"5500"));


        System.out.println("BMW compared with audi: " + BMW.compareTo(audi));

        Car mercedes = new Car("Mercedes","GLC","Black",45_000,
                new Engine("V6",420,"6000"));

        List<Car> carList = new ArrayList<>();
        carList.add(BMW);
        carList.add(audi);
        carList.add(mercedes);

        carList.sort(Comparator.comparing(car -> car.getEngine().getHorsePower()));
        for(Car car : carList){
            System.out.println(car);
        }
    }
}

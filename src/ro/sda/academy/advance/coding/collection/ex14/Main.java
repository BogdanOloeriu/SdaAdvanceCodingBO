package ro.sda.academy.advance.coding.collection.ex14;

public class Main {

    public static void main(String[] args) {

        Zoo zoo =  new Zoo();
        zoo.addAnimals("Lion",2);
        zoo.addAnimals("Cat",2);
        zoo.addAnimals("Wolf",2);
        zoo.addAnimals("Crocodile",2);

        System.out.println(zoo.getNumberOfAllAnimals());

        System.out.println(zoo.getAnimalCount());
    }
}

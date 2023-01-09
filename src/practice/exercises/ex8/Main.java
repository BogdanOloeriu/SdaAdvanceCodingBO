package practice.exercises.ex8;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimals("Lion",2);
        zoo.addAnimals("Snake",3);
        zoo.addAnimals("Snake",4);

        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getNumberOfAllAnimals());
    }
}

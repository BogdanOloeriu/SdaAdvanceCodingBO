package practice.exercises.ex50;

public class Main {

    public static void main(String[] args) {


        Zoo zoo = new Zoo();
        zoo.addAnimals("Dogs",3);
        zoo.addAnimals("Lion",5);
        zoo.addAnimals("Cats",20);

        System.out.println(zoo.getAnimalsCount());


    }
}

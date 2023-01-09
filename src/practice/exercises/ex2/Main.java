package practice.exercises.ex2;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Black","4");

        System.out.println(dog.toString());
        System.out.println(dog.getNumberOfFoot());

        dog.SoundUp();

        Dog dog1 = new Dog("Rex","white","4");

        dog1.SoundUp();

    }
}

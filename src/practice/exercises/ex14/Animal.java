package practice.exercises.ex14;

public abstract class Animal {

    abstract void makeSound();

    public void canEat(){
        System.out.println("All animals can eat!");
    }

}

class Main{

    public static void main(String[] args) {

    }
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("All dogs bark!!");
    }

    @Override
    public void canEat() {
        super.canEat();
        System.out.println("All dogs love bones!");

    }
}

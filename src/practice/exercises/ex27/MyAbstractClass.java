package practice.exercises.ex27;

public abstract class MyAbstractClass {

    public abstract void doIt();
}

class Main{

    public static void main(String[] args) {

        MyAbstractClass myAbstractClass = new MyAbstractClass() {
            @Override
            public void doIt() {
                System.out.println("Hello from the anonymous Class!");
            }
        };
        myAbstractClass.doIt();
    }
}

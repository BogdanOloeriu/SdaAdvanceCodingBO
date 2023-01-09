package practice.exercises.ex18;

public class Main {

    public static void main(String[] args) {

        DoSomething object1 = new DoSomething() {
            @Override
            void doSomething() {
                System.out.println("Here is the anonymous class!");
            }
        };

        object1.doSomething();

        Calculate calculate = (x,y) -> System.out.println(x+y);
        calculate.calculate(10,5);
    }



}

abstract class DoSomething{

    abstract void doSomething();

}

interface Calculate{

    void calculate(int x,int y);
}

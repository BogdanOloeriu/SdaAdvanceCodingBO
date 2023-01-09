package homework.advance.coding.task2;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(divideOperation(1,0));
        }catch (CanNotDivideByZero e){
            System.err.println(e.getMessage());
        }


    }

    public static Double divideOperation(double a, double b){

        return a/b;
    }
}

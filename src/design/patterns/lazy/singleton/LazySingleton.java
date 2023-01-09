package design.patterns.lazy.singleton;

public class LazySingleton {


    private static LazySingleton instance;
    private int number;

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

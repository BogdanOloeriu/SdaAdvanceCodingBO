package design.patterns.eager.singleton;

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("EagerSingleton being initialized");
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}

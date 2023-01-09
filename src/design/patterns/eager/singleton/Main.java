package design.patterns.eager.singleton;

public class Main {

    public static void main(String[] args) {

        EagerSingleton el1 = EagerSingleton.getInstance();
        System.out.println(el1.hashCode());

        EagerSingleton el2 = EagerSingleton.getInstance();
        System.out.println(el2.hashCode());
    }
}

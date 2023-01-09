package practice.exercises.ex46;

public class Main {

    public static void main(String[] args) {


        Storage storage = new Storage();
        storage.addToStorage("Ro45","Alex");
        storage.addToStorage("Ro45","John");
        storage.addToStorage("Ro45","Alex");
        storage.addToStorage("Ro45","Andrew");
        storage.addToStorage("Ro46","Mihai");
        storage.addToStorage("Ro46","Costel");

        storage.printValue("Ro45");
        System.out.println(storage.findKeys("Alex"));
    }
}

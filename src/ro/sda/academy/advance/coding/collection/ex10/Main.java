package ro.sda.academy.advance.coding.collection.ex10;

public class Main {

    public static void main(String[] args) {

        Storage studentStorage = new Storage();
        studentStorage.addToStorage("Ro45","Alex");
        studentStorage.addToStorage("Ro45","John");
        studentStorage.addToStorage("Ro45","Mihai");
        studentStorage.addToStorage("Ro46","Alex");
        studentStorage.addToStorage("Ro46","Marica");
        studentStorage.addToStorage("Ro46","Messi");

        studentStorage.printValue("Ro45");
        studentStorage.printValue("Ro46");
        studentStorage.printValue("Ro47");
    }
}

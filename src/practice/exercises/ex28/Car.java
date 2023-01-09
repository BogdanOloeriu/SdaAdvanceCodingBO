package practice.exercises.ex28;

public class Car {

    private String name;
    private String model;
    private String colour;
    private Engine engine;

    public Car(String name, String model, String colour, Engine engine) {
        this.name = name;
        this.model = model;
        this.colour = colour;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                '}';
    }
}

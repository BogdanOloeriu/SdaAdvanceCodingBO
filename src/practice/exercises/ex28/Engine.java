package practice.exercises.ex28;

public class Engine {

    private String name;
    private String model;

    public Engine(String name, String model){
        this.name = name;
        this.model = model;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

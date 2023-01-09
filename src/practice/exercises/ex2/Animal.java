package practice.exercises.ex2;

public class Animal {

    private String name;
    private String colour;

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void SoundUp(){
        System.out.println("All animals has a sound!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

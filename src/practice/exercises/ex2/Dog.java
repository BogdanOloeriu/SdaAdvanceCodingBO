package practice.exercises.ex2;

public class Dog extends Animal{

    private String numberOfFoot;

    public Dog(String name, String colour, String numberOfFoot) {
        super(name, colour);
        this.numberOfFoot = numberOfFoot;
    }

    @Override
    public void SoundUp() {
        super.SoundUp();
        System.out.println("A dog can bark!");
    }

    public String getNumberOfFoot() {
        return numberOfFoot;
    }

    public void setNumberOfFoot(String numberOfFoot) {
        this.numberOfFoot = numberOfFoot;
    }
}

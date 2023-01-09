package practice.exercises.ex34;

public abstract class Shape3D extends Shape implements Fillable {

    public abstract double calculateVolume();

    @Override
    public void fill(double water) {
        double volume = calculateVolume();
        if(volume > water){
            System.out.println("Not pouring enough water!");
        }else if ( volume == water){
            System.out.println("Fill the figure with water to the brim!");
        }else {
            System.out.println("Will pour too much water into the figure and overflow!");
        }
    }
}

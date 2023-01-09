package homework.advance.coding.task1;

public class Point2D {

    private float x;
    private float y;

    public Point2D(){
        this(0,0);
    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

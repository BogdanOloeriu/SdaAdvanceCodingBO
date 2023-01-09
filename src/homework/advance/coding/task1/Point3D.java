package homework.advance.coding.task1;

public class Point3D extends Point2D{

    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] floatArray = new float[3];
        floatArray[0] = super.getX();
        floatArray[1] = super.getY();
        floatArray[2] = this.z;

        return floatArray;
    }

    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z = z;

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + "y= " + super.getY() + "x= " + super.getX() +
                '}';
    }
}

package homework.advance.coding.task4;

public class Parcel {

    private int length;
    private int width;
    private int height;
    private int weight;
    private Boolean isExpress;

    public Parcel(int length, int width, int height, int weight, Boolean isExpress) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getExpress() {
        return isExpress;
    }

    public void setExpress(Boolean express) {
        isExpress = express;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }
}

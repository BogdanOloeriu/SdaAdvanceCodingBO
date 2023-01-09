package home.work.advance.coding.generics.ex1;

public class FirstExample {

    public static void main(String[] args) {

        Box<Gift> giftBox = new Box<>();

        giftBox.putInside(new Gift("Wine",200));

        System.out.println(giftBox.getObjectInside());

    }


}
class Box<T> {

    private T objectInside;

    public void putInside(T objectInside){
        this.objectInside = objectInside;
    }

    public T getObjectInside() {
        return objectInside;
    }
}

class Gift {

    private String name;
    private int price;

    public Gift(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


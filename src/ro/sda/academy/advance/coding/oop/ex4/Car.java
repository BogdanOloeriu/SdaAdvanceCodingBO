package ro.sda.academy.advance.coding.oop.ex4;

public enum Car {

    FERRARI(2_000_000,600,false),
    PORSCHE(1_500_000,550,false),
    MERCEDES(120_000,350,false),
    BMW(100_000,400,true),
    OPEL(25_000,120,true),
    FIAT(10_000,100,true),
    TOYOTA(35_000,150,true);

    private final double price;
    private final double power;

    private final Boolean isRegular;

    Car(double price, double power,Boolean isRegular) {
        this.price = price;
        this.power = power;
        this.isRegular=isRegular;
    }

    public double getPrice() {
        return price;
    }

    public double getPower() {
        return power;
    }

    public Boolean isRegular(){
        return isRegular;
    }

    public Boolean isPremium(){
        return !isRegular();
    }

    public Boolean isFasterThen(Car car){
        double result = Double.compare(this.power,car.power);
        return result > 0;
    }
}

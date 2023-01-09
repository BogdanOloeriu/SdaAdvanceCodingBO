package practice.exercises.ex33;

public enum Car {
    FERRARI(2_000_000,550,false),
    PORSCHE(1_500_000,600,false),
    MERCEDES(100_000,450,false),
    BMW(120_000,460,false),
    OPEL(25_000,150,true),
    FIAT(12_000,100,true),
    TOYOTA(35_000,200,true);

    private int price;
    private int power;
    private boolean isPremium;

    Car(int price, int power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium = isPremium;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public Boolean isPremium(){
        return isPremium;
    }
    public Boolean isRegular(){
        return !isPremium;
    }

    public Boolean isFasterThan(Car car){
        int result = Double.compare(this.power,car.getPower());
        return result > 0;
    }
}

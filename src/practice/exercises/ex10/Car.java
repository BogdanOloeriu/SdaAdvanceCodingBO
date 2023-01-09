package practice.exercises.ex10;

public enum Car {

    FERRARI(2_000_000,600,false),
    PORSCHE(1_000_000,550,false),
    MERCEDES(100_000,500,false),
    BMW(90_000,550,true),
    OPEL(20_000,150,true),
    FIAT(10_000,120,true),
    TOYOTA(15_000,200,true);

    private int price;
    private int power;
    private boolean isRegular;

    Car(int price, int power,boolean isRegular) {
        this.price = price;
        this.power = power;
        this.isRegular = isRegular;
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

    public boolean isRegular() {
        return isRegular;
    }

    public void setRegular(boolean regular) {
        isRegular = regular;
    }

    public boolean isPremium(){
        return !isRegular();
    }

    public boolean isFaster(Car car){
        int result = Double.compare(this.power,car.getPower());
        return result > 0;
    }
}

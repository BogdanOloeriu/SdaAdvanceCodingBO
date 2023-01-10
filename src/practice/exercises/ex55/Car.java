package practice.exercises.ex55;

public enum Car {

    FERRARI(1_000_000,600,false),
    BMW(100_000,400,true),
    OPEL(45_000,150,true);

    private Integer price;
    private Integer power;
    private Boolean isRegular;

    Car(Integer price, Integer power, Boolean isRegular) {
        this.price = price;
        this.power = power;
        this.isRegular = isRegular;
    }

    public Boolean isRegular(){
        return isRegular;
    }

    public Boolean isPremium(){
        return !isRegular;
    }

    public Boolean isFasterThan(Car car){
        return Double.compare(power,car.getPower()) > 0;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Boolean getRegular() {
        return isRegular;
    }

    public void setRegular(Boolean regular) {
        isRegular = regular;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", power=" + power +
                ", isRegular=" + isRegular +
                '}';
    }
}

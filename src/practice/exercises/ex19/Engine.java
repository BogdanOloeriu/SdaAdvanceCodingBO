package practice.exercises.ex19;

public class Engine {

    private String model;
    private Integer horsePower;
    private String RPM;

    public Engine(String model, Integer horsePower, String RPM) {
        this.model = model;
        this.horsePower = horsePower;
        this.RPM = RPM;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public String getRPM() {
        return RPM;
    }

    public void setRPM(String RPM) {
        this.RPM = RPM;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", RPM='" + RPM + '\'' +
                '}';
    }
}

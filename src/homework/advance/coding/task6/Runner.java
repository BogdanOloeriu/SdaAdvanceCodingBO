package homework.advance.coding.task6;

public enum Runner {

    REGULAR(100,200),
    ATHLETIC(200,400);

    private int minimumTimeOfRunning;
    private int maximumTimeOfRunning;

    Runner(int minimumTimeOfRunning, int maximumTimeOfRunning) {
        this.minimumTimeOfRunning = minimumTimeOfRunning;
        this.maximumTimeOfRunning = maximumTimeOfRunning;
    }

    public int getMinimumTimeOfRunning() {
        return minimumTimeOfRunning;
    }

    public int getMaximumTimeOfRunning() {
        return maximumTimeOfRunning;
    }

    public static Runner getRunnerType(int timeOfRunning){
        if(timeOfRunning >=100 && timeOfRunning < 200){
            return Runner.REGULAR;
        }else if(timeOfRunning >= 200 && timeOfRunning <= 400){
            return Runner.ATHLETIC;
        }else{
            return null;
        }
    }
}

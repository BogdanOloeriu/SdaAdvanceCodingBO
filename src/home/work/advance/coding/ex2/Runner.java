package home.work.advance.coding.ex2;

public enum Runner {
    BEGINNER(10,100),
    INTERMEDIATE(100,200),
    ADVANCED(200,300);

    private final int minimumTimeOfRunning;
    private final int maximumTimeOfRunning;

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

    public static Runner getFitnessLevel(int timeOfRunning){
        if(timeOfRunning >= 10 && timeOfRunning <= 100){
            return Runner.BEGINNER;
        }else if(timeOfRunning > 100 && timeOfRunning <= 200){
            return Runner.INTERMEDIATE;
        }else if(timeOfRunning > 200 && timeOfRunning <= 300){
            return Runner.ADVANCED;
        }
        return null;
    }
}

package practice.exercises.ex50;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Zoo {

    private final Map<String,Integer> zooAnimals = new HashMap<>();

    public int getNumbersOfAnimals(){
        return zooAnimals.values().stream()
                .collect(Collectors.summingInt(zooAnimals -> zooAnimals));
    }

    public Map<String,Integer> getAnimalsCount(){
        return new HashMap<>(zooAnimals);
    }

    public void addAnimals(String species, int count){
        if(zooAnimals.containsKey(species)){
            zooAnimals.put(species,zooAnimals.get(species) + count);
        }else{
            zooAnimals.put(species,count);
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooAnimals=" + zooAnimals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zoo)) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(zooAnimals, zoo.zooAnimals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zooAnimals);
    }
}

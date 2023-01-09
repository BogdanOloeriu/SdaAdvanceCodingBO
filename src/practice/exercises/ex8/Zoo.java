package practice.exercises.ex8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {

    private final Map<String,Integer> animals = new HashMap<>();

    public int getNumberOfAllAnimals(){
        return animals.values().stream()
                .collect(Collectors.summingInt(animals -> animals));
    }

    public Map<String,Integer> getAnimalsCount (){
        return new HashMap<>(animals);
    }

    public void addAnimals(String animal, int count){
        if(animals.containsKey(animal)){
            animals.put(animal,animals.get(animal) + count);
        }else {
            animals.put(animal,count);
        }
    }
}

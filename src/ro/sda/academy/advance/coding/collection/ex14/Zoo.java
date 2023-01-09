package ro.sda.academy.advance.coding.collection.ex14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Create a Zoo class that will have a collection of animals and will allow you to receive statistics about your animals:
 *  int getNumberOfAllAnimals() → returns the number of all animals Map
 * getAnimalsCount() → returns the number of animals of each species Map
 * void addAnimals(String, int) → adds n animals of a given species
 */

public class Zoo {

    private final Map<String,Integer> zoo = new HashMap<>();

    public int getNumberOfAllAnimals(){
        return zoo.values().stream()
                .collect(Collectors.summingInt(numberOfAnimals -> numberOfAnimals));
    }

    public Map<String,Integer> getAnimalCount(){
        return new HashMap<>(zoo);
    }

    public void addAnimals(String name,int numberOfAnimals){
        if(zoo.containsKey(name)){
            zoo.put(name,zoo.get(name) + numberOfAnimals);
        }else{
            zoo.put(name,numberOfAnimals);
        }
    }


}

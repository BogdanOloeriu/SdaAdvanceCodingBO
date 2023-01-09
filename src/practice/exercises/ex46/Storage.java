package practice.exercises.ex46;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {

    private final Map<String, List<String>> stringMap = new HashMap<>();


    public void addToStorage(String key,String value){
        if(stringMap.containsKey(key)){
            List<String> inputList = stringMap.get(key);
            inputList.add(value);
            stringMap.put(key,inputList);
        }else{
            List<String> inputList = new ArrayList<>();
            inputList.add(value);
            stringMap.put(key,inputList);
        }
    }

    public void printValue(String key){
        List<String> mapStorage = stringMap.get(key);
        if(mapStorage == null){
            System.out.println("There is no value for the key: " + key);
        }else {
            System.out.println("Value for the key: " + key + " -> " + mapStorage);
        }
    }

    public List<String> findKeys(String value){
        return stringMap.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "Storage{" +
                "stringMap=" + stringMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Storage)) return false;
        Storage storage = (Storage) o;
        return Objects.equals(stringMap, storage.stringMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stringMap);
    }
}

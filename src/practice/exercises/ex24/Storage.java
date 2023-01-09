package practice.exercises.ex24;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {

    private final Map<String, List<String>> stringListMap = new HashMap<>();
    List<Double> averageList = new ArrayList<>();
    TreeMap<String,String> treeMap = new TreeMap<>((s1,s2) -> s1.compareTo(s2));

    public void addStorage(String key, String value){
        if(stringListMap.containsKey(key)){
            List<String> values = stringListMap.get(key);
            values.add(value);
            stringListMap.put(key,values);
        }else{
            List<String> values = new ArrayList<>();
            values.add(value);
            stringListMap.put(key,values);
        }
    }

    public void getValues(String key){
        List<String> mapStorage = stringListMap.get(key);
        if(mapStorage.isEmpty()){
            throw new IllegalStateException("Map is empty!");
        }else {
            System.out.println("Value for the Key " + key + " are: " + mapStorage);
        }
    }

    public Set<String> findKey(String value){
        return stringListMap.entrySet()
                .stream()
                .filter(v -> v.getValue().contains(value))
                .map(v-> v.getKey())
                .collect(Collectors.toSet());
    }

    public Double average(){
        return averageList
                .stream()
                .collect(Collectors.averagingDouble(averageList -> averageList));
    }

    public void printFirstAndLast(TreeMap<String,String> stringStringTreeMap){
        System.out.println("First entry: " + stringStringTreeMap.firstEntry());
        System.out.println("Last entry: " + stringStringTreeMap.lastEntry());
    }
}

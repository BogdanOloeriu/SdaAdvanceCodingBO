package practice.exercises.ex5;

import java.util.*;

public class Storage {


    private final Map<String, List<String>> stringMap =new HashMap<>();

    public void addToStorage(String key, String value){

        if(stringMap.containsKey(key)){
            List<String> values = stringMap.get(key);
            values.add(value);
            stringMap.put(key,values);
        }else{
            List<String> values = new ArrayList<>();
            values.add(value);
            stringMap.put(key,values);
        }
    }

    public void printValues(String key){
        List<String> valuesKey = stringMap.get(key);
        if(valuesKey == null){
            System.out.println("No values for the key in map " + key);
        }else {
            System.out.println("Values for the key: " + key + " are: " + valuesKey);
        }
    }

    public Set<String> findKeys (String value){
        Set<String> keys = new HashSet<>();
        for(Map.Entry<String,List<String>> entry : stringMap.entrySet()){
            if(entry.getValue().contains(keys)){
                keys.add((entry.getKey()));
            }
        }
        return keys;
    }
}

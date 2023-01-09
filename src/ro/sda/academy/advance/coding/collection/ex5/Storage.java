package ro.sda.academy.advance.coding.collection.ex5;


import java.util.*;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value)→ adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findKeys(String value) → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */

public class Storage {

    private final Map<String, List<String>> stringMap = new HashMap<>();

    public void addToStorage(String key, String value){
        if(stringMap.containsKey(key)){
            List<String> values = stringMap.get(key);
            values.add(value);
            stringMap.put(key,values);
        }else {
            List<String> values = new ArrayList<>();
            values.add(value);
            stringMap.put(key,values);
        }

            Set<String> setList = new HashSet<>();

    }
}

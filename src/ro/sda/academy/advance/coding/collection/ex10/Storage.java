package ro.sda.academy.advance.coding.collection.ex10;

import java.util.*;

public class Storage {

    private final Map<String, List<String>> stringListMap = new HashMap<>();

    public void addToStorage(String key, String value) {
        if (stringListMap.containsKey(key)) {
            List<String> values = stringListMap.get(key);
            values.add(value);
            stringListMap.put(key, values);
        } else {
            List<String> values = new ArrayList<>();
            values.add(key);
            stringListMap.put(key, values);
        }
    }

    public void printValue(String key) {
        List<String> mapStorage = stringListMap.get(key);
        if (mapStorage == null) {
            System.out.println("No values for the key in map" + key);
        } else {
            System.out.println("Value for key : " + key + " -> " + mapStorage);
        }
    }

    public Set<String> findKeys(String value) {
        Set<String> keys = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : stringListMap.entrySet()) {
            if (entry.getValue().contains(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}

package ro.sda.academy.advance.coding.oop.ex9;

import java.util.ArrayList;
import java.util.List;

public class SdaArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int numberOfSkippedElements){
        List<T> collectorList = new ArrayList<>();
        if(startIndex < 0 || startIndex > collectorList.size()){
            throw new IllegalStateException("Invalid Start index!");
        }
        if(numberOfSkippedElements < 0){
            throw new IllegalStateException("Invalid number of skipped elements!");
        }
        for (int i = startIndex; i< size(); i +=numberOfSkippedElements + 1){
            collectorList.add(get(i));
        }

        return collectorList;
    }
}

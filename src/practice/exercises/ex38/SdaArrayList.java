package practice.exercises.ex38;

import java.util.ArrayList;
import java.util.List;

public class SdaArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int skippedElements){
        List<T> collectorList = new ArrayList<>();
        if(startIndex < 0 || startIndex > size()){
            throw new IllegalStateException("Invalid startIndex: " + startIndex);
        }
        if(skippedElements < 0){
            throw new IllegalStateException("NumberOfSkippedElements is Invalid!");
        }
        for(int i = startIndex; i< size(); i+= skippedElements + 1){
            collectorList.add(get(i));
        }
        return collectorList;
    }
}

package practice.exercises.ex60;

import java.util.ArrayList;
import java.util.List;

public class SDArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndex, int numberOfSkippedElements){
        List<T> collectorList = new ArrayList<>();
        for(int i = startIndex; i < size(); i+=numberOfSkippedElements + 1){
            collectorList.add(get(i));
        }
        return collectorList;
    }
}

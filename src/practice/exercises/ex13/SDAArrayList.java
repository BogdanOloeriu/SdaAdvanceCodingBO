package practice.exercises.ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SDAArrayList<T> extends ArrayList<T> {


    public List<T> joinList(int startIndex, int numberOfSkippedElements){
        List<T> collectorList = new ArrayList<>();
        for(int i = startIndex; i < size(); i += numberOfSkippedElements + 1 ){
            collectorList.add(get(i));
        }
        return collectorList;
    }


}

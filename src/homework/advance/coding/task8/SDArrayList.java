package homework.advance.coding.task8;

import java.util.ArrayList;
import java.util.List;

public class SDArrayList<T> extends ArrayList<T> {


    public List<T> getEveryNthElement(int startIndex, int numberOfSkippedElements){
        if(startIndex < 0 && startIndex > size()){
            throw new IllegalStateException("Invalid startIndex");
        }
        if(numberOfSkippedElements > size() && numberOfSkippedElements < 0){
            throw new IllegalStateException("Invalid Number Of Skipped Elements!");
        }
        List<T> storeList = new ArrayList<>();
        for(int i = startIndex; i < size(); i += numberOfSkippedElements + 1){
            storeList.add(get(i));
        }
        return storeList;
    }
}

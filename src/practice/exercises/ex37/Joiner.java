package practice.exercises.ex37;

import java.util.List;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> inputList){
        String result = "";
        for(int i = 0; i< inputList.size();i++){
            result = result + inputList.get(i).toString();
            if(i != inputList.size() - 1){
                result = result + separator;
            }
        }
        return result;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    @Override
    public String toString() {
        return "Joiner{" +
                "separator='" + separator + '\'' +
                '}';
    }
}

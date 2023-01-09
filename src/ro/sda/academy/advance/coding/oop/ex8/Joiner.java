package ro.sda.academy.advance.coding.oop.ex8;

import java.util.List;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> elements) {
        String result = "";
        for(int i = 0; i< elements.size(); i++){
            result = result + elements.get(i).toString();
            if(i != elements.size() - 1){
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

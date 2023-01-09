package practice.exercises.ex26;

public class Main {

    public static void main(String[] args) {

        createPari("Marcu","Andrei");
    }

    public static void createPari(String k, String v){

        class Pair{
            public String key;
            public String value;

            public Pair(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }
        Pair myPair = new Pair(k,v);
    }
}

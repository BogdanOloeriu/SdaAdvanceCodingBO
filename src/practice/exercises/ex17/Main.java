package practice.exercises.ex17;

public class Main {

    public static void main(String[] args) {

        createPair("ket","Value");



    }

    public static void createPair(String k,String v){
        class Pair{

            private String value;
            private String key;

            public Pair(String value, String key) {
                this.value = value;
                this.key = key;
            }
        }
        Pair pair = new Pair(v,k);
    }

}

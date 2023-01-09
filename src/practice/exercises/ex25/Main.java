package practice.exercises.ex25;

public class Main {

    public static void main(String[] args) {

        Greetings.Romanian romanian = new Greetings.Romanian();
        romanian.romanianGreetings();

        System.out.println("--------------------------------");

        Greetings greetings = new Greetings();
        Greetings.English englishGreetings = greetings.new English();

        englishGreetings.englishGreetings();

    }
}

class Greetings{

    private static String ROMANIAN_GREETINGS = "Buna ziua!";
    private static String ENGLISH_GREETINGS = "Welcome!";

    static class Romanian{

        public void romanianGreetings(){
            System.out.println(ROMANIAN_GREETINGS);
        }
    }

    class English{

        public void englishGreetings(){
            System.out.println(ENGLISH_GREETINGS);
        }
    }
}

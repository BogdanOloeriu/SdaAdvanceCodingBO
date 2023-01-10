package practice.exercises.ex61;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i<10; i++){
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(new Random().nextInt(2000));
        }

    }
}

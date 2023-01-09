package concurency.and.thread.EX1;

import static concurency.and.thread.EX1.ThreadColor.*;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from another thread!");

        try {
            Thread.sleep(3000);
            Thread.sleep(300,200);
        }catch (InterruptedException e){
            System.out.println(ANSI_PURPLE + "Another thread woke up!");
            return;
        }

        System.out.println(ANSI_BLACK + "Three seconds have passed!");
    }

}

package concurency.and.thread.ex2;

import static concurency.and.thread.EX1.ThreadColor.ANSI_RED;

public class MyRunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from the Runnable Thread Interface");
    }
}

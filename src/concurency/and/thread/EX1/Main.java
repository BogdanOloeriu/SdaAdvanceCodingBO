package concurency.and.thread.EX1;

import static concurency.and.thread.EX1.ThreadColor.ANSI_GREEN;
import static concurency.and.thread.EX1.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from the main thread!");

        AnotherThread thread1 = new AnotherThread();
        thread1.start();
        thread1.interrupt();

        System.out.println("Hello again from the main thread!");

        //nu poti sa pornesti acelasi thread de 2 ori

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread!");
            }
        }.start();


    }
}

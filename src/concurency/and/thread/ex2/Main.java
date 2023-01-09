package concurency.and.thread.ex2;

import java.sql.SQLOutput;

import static concurency.and.thread.EX1.ThreadColor.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(ANSI_BLUE + "Hello from Main Thread!");

        Thread thread1 = new Thread(new MyRunnableThread()){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN+ "Hello from anonymous Runnable Thread!");
            }
        };
        thread1.start();

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "Hello from " + currentThread().getName());
                try{
                    thread1.join(2000);
                    System.out.println(ANSI_RED+ " THREAD1 TERMINATED, SO I AM RUNNING AGAIN!");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I could not wait after all. I was interrupted!");
                }
            }
        };
        thread2.setName("==Another Thread==");
        thread2.start();



    }
}

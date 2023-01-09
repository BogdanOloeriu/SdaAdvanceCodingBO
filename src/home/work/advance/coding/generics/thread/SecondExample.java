package home.work.advance.coding.generics.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;

public class SecondExample {

    static Map<String, String> shareMap = new HashMap<>();

    static {
        System.out.println("Hello from static initializer");
        shareMap.put("Key","something");

    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        t3.start();

        Thread t5 = new Thread(new MyRunnableSynchronized());
        Thread t6 = new Thread(new MyRunnableSynchronized());
        Thread t7 = new Thread(new MyRunnableSynchronized());
        t5.start();
        t6.start();
        t7.start();

    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            if (shareMap.containsKey("Key")) {
                System.out.println(Thread.currentThread().getName());
                //heavy work
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                String val = shareMap.remove("Key");

                if (val == null) {
                    System.out.println("Value for key was null!");
                }
            } else {
                System.out.println("Condition was false!");
            }
        }
    }

    static class MyRunnableSynchronized implements Runnable {

        @Override
        public void run() {
            //asteapta unul dupa celalalt
            synchronized (shareMap){
                if (shareMap.containsKey("Key")) {
                    System.out.println(Thread.currentThread().getName());
                    //heavy work
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    String val = shareMap.remove("Key");

                    if (val == null) {
                        System.out.println("Value for key was null!");
                    }
                } else {
                    System.out.println("Condition was false!");
                }
            }
        }
    }
}

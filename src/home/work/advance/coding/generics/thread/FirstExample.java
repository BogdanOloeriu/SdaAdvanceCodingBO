package home.work.advance.coding.generics.thread;

import java.util.Arrays;
import java.util.List;

public class FirstExample {

    static final List<Integer> largeCollection = Arrays.asList(1,2,3,4,5,6);

    public static void main(String[] args) {


        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (Integer el : largeCollection){
                    System.out.println(el);
                }
                System.out.println("----------------");
            }
        };

        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (Integer el : largeCollection){
                    System.out.println(el);
                }
                System.out.println("-------------");
            }
        };

        t2.start();
    }
}

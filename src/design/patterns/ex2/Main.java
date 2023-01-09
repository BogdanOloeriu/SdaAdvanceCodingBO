package design.patterns.ex2;

public class Main {

    public static void main(String[] args) {


        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ServersThread serversThread = ServersThread.getInstance();
                System.out.println(serversThread.hashCode());
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ServersThread serversThread = ServersThread.getInstance();
                System.out.println(serversThread.hashCode());
            }
        });

        th1.start();
        th2.start();
    }
}

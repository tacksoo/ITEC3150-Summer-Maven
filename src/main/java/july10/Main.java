package july10;

public class Main {

    public static void main(String[] args) {
        Greeter g = new Greeter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    g.sayHi();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    g.sayBye();
                }
            }
        });
        t1.start();
        t2.start();

    }
}

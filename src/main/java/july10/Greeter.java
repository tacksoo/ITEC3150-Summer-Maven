package july10;

public class Greeter {

    private boolean flag = true;

    public synchronized void sayHi() {
        while(!flag) {
            try {
                wait();
            } catch(InterruptedException e) {}
        }
        flag = false;
        System.out.println("hi!");
        notifyAll();
    }

    public synchronized void sayBye() {
        while(flag) {
            try {
                wait();
            } catch(InterruptedException e) {}
        }
        flag = true;
        System.out.println("bye!");
        notifyAll();
    }
}

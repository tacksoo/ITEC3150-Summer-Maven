package july09;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1200);
        Person karen = new Person("karen",account);
        Person darren = new Person("darren", account);
        karen.start();
        darren.start();
    }
}

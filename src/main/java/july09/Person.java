package july09;

public class Person extends Thread {

    private BankAccount account;
    private String name;

    public Person(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.withdraw(100);
            System.out.println(name + " " + account.getUserBalance());
        }
    }
}

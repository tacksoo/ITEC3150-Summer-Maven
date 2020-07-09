package july09;

public class BankAccount {
    private double userBalance;

    public BankAccount(double userBalance) {
        this.userBalance = userBalance;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public synchronized boolean deposit(double amount) {
        double newBalance;
        if( amount < 0.0 ) {
            return false;
        } else {
            newBalance = userBalance + amount;
            userBalance = newBalance;
            return true;
        }
    }

    public synchronized boolean withdraw(double amount) {
        double newBalance;
        if( amount > userBalance ) {
            return false;
        } else {
            newBalance = userBalance - amount;
            userBalance = newBalance;
            return true;
        }
    }
}

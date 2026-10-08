class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> account.deposit(200));
        Thread t2 = new Thread(() -> account.withdraw(100));
        t1.start();
        t2.start();
    }
}

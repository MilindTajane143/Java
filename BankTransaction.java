class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " +
                    balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread t1 = new Thread(() -> account.deposit(500));
        Thread t2 = new Thread(() -> account.withdraw(300));
        t1.start();
        t2.start();
    }
}
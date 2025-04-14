class BankAccount {
    private double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        System.out.println("");
    }
}
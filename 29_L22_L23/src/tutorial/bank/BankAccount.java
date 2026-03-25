package tutorial.bank;
abstract class BankAccount {
    protected final int routingNumber;
    protected String accountHolder;
    protected double balance;

    BankAccount(String name, double initialDeposit, int routing) {
        accountHolder = name;
        balance = initialDeposit;
        routingNumber = routing; // A final variable cannot be changed after initialization
    }

    void displayBalance() {
        System.out.println(accountHolder + " (" + routingNumber + ") Balance: $" + balance);
    }

    abstract void calculateInterest();
}
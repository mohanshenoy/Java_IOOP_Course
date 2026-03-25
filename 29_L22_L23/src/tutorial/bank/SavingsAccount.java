package tutorial.bank;
final class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double deposit, int routing) {
        super(name, deposit, routing);
    }
    void calculateInterest() {
        double interest = balance * 0.04; // 4% interest
        System.out.println("Savings Interest added: $" + interest);
        balance += interest;
    }
}
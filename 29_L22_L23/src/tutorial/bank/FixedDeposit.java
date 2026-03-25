package tutorial.bank;


class FixedDeposit extends BankAccount {
    FixedDeposit(String name, double deposit, int routing) {
        super(name, deposit, routing);
    }
    void calculateInterest() {
        double interest = balance * 0.08; // 8% interest
        System.out.println("Fixed Deposit Interest added: $" + interest);
        balance += interest;
    }
}
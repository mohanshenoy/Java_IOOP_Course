package tutorial.bank;

public class BankSystemDemo {
    public static void main(String[] args) {
        // BankAccount acc = new BankAccount(...); // Error! Cannot instantiate abstract class [cite: 1009]

        // Superclass reference pointing to a SavingsAccount object [cite: 700]
        BankAccount myAccount;

        myAccount = new SavingsAccount("Matt", 1000.0, 55001);
        myAccount.displayBalance();
        myAccount.calculateInterest();
        
        System.out.println("--- Switch to Fixed Deposit ---");

        myAccount = new FixedDeposit("Kenn", 5000.0, 55002);
        myAccount.displayBalance();
        myAccount.calculateInterest();
    }
}
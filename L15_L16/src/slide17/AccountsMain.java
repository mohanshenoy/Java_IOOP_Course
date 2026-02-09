package slide17;

class Bank {
    private static String bankName = "Global Bank";
    static class Account {
        private String accountNumber;
        private double balance;
        Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        void displayAccountDetails() {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }
}

public class AccountsMain {
    public static void main(String[] args) {
        Bank.Account account = new Bank.Account("12345", 2500.75);
        account.displayAccountDetails();
    }
}
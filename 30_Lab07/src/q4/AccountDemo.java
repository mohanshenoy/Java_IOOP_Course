package q4;
import java.util.Scanner;

class Account {
    String customerName;
    long accountNo;
    String accountType;
    double balance;
    Account(String name, long accountNo, String accountType, double initialBal) {
        this.customerName = name;
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = initialBal;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }
    void displayBalance() {
        System.out.println("Account No: " + accountNo + " | Current Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    double interestRate = 0.05; // 5% interest
    SavingsAccount(String name, long accNo, double initialBal) {
        super(name, accNo, "Savings", initialBal);
    }
    void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest + " | New Balance: " + balance);
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurrentAccount extends Account {
    double minBalance = 500.0;
    double serviceTax = 50.0;
    CurrentAccount(String name, long accNo, double initialBal) {
        super(name, accNo, "Current", initialBal);
    }
    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceTax;
            System.out.println("Balance below minimum! Service tax of " + serviceTax + " imposed.");
            System.out.println("Updated Balance: " + balance);
        }
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
            checkMinBalance();
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Creating Savings Account --------");
        SavingsAccount sa = new SavingsAccount("Matt", 101, 1000.0);
        sa.displayBalance();
        sa.deposit(500);
        sa.computeAndDepositInterest();
        sa.withdraw(300);
        sa.displayBalance();

        System.out.println("--------------------------------------------");
        
        System.out.println("Creating Current Account --------");
        CurrentAccount ca = new CurrentAccount("Kenn", 202, 600.0);
        ca.displayBalance();
        ca.withdraw(200);  
        ca.displayBalance();
        
        sc.close();
    }
}
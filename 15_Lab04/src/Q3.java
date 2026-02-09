

/**
 * Define a java class to represent a Bank account. Include the following members. 
 * Data members: 
 * Name of the depositor 
 * Account number. 
 * Type of account. 
 * Balance amount in the account. 
 * Rate of interest (static data) 
 * Provide a default constructor and parameterized constructor to this class. Also provide Methods: 
 * To deposit amount. 
 * To withdraw amount after checking for minimum balance. 
 * To display all the details of an account holder. 
 * Display rate of interest (a static method) 
 * Illustrate all the constructors as well as all the methods by defining objects. 
 */

class BankAccount {
    String nameOfDepositor;
    long accountNumber;
    String accountType;
    double balanceAmount;
    static double rateOfInterest = 3; // Static data

    public BankAccount() {
        this.nameOfDepositor = "Not Assigned";
        this.accountNumber = 0;
        this.accountType = "Savings";
        this.balanceAmount = 0.0;
    }

    public BankAccount(String name, long accNum, String type, double initialBal) {
        this.nameOfDepositor = name;
        this.accountNumber = accNum;
        this.accountType = type;
        this.balanceAmount = initialBal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
        	balanceAmount += amount;
            System.out.println("Successfully deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (balanceAmount - amount >= 0) {
        	balanceAmount -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("No Amount in Account !");
        }
    }

    public void display() {
        System.out.println("--- Account Details ---");
        System.out.println("Name: " + nameOfDepositor);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Type: " + accountType);
        System.out.println("Balance: " + balanceAmount);
    }

    public static void displayRateOfInterest() {
        System.out.println("Current Rate of Interest: " + rateOfInterest + "%");
    }
}

public class Q3 {
    public static void main(String[] args) {

    	System.out.println("........Illustrating Default Constructor-----------");
        BankAccount acc1 = new BankAccount();
        acc1.display();

        System.out.println("...........Illustrating Parameterized Constructor...........");
        BankAccount acc2 = new BankAccount("Mohan Shenoy", 12345L, "Savings", 10000);
        acc2.deposit(500.0);
        acc2.withdraw(300.0);
        acc2.display();
        
        System.out.println("..........Display rate of interest (a static method)....");
    	BankAccount.displayRateOfInterest();
    }
}
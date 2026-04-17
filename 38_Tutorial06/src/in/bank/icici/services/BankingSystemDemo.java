package in.bank.icici.services;
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) { super(message); }
}
class DailyLimitExceededException extends Exception {
    public DailyLimitExceededException(String message) { super(message); }
}
class TaxComplianceException extends Exception {
    public TaxComplianceException(String message) { super(message); }
}

class Account {
    protected String customerName;
    protected String accountNumber;
    protected double balance;
    private static final double DAILY_LIMIT = 100000;
    public Account(String name, String accNum, double initialBalance) {
        this.customerName = name;
        this.accountNumber = accNum;
        this.balance = initialBalance;
    }
    public void withdraw(double amount) throws InsufficientFundsException, DailyLimitExceededException, TaxComplianceException {
        if (amount > DAILY_LIMIT) {
            throw new DailyLimitExceededException("Transaction exceeds security limit of 100,000.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }
}

class CorporateAccount extends Account {
    private boolean hasValidTaxID;
    public CorporateAccount(String name, String accNum, double balance, boolean hasTaxID) {
        super(name, accNum, balance);
        this.hasValidTaxID = hasTaxID;
    }
	@Override
    public void withdraw(double amount) throws InsufficientFundsException, DailyLimitExceededException, TaxComplianceException {
        if (amount > 500000 && !hasValidTaxID) {
        	throw new TaxComplianceException("Tax Compliance Error: International transfer > 500k requires Tax ID.");
        }
        super.withdraw(amount);
    }
}
public class BankingSystemDemo {
    public static void main(String[] args) {
        CorporateAccount corpAcc = new CorporateAccount("TechCorp", "CA98765", 1000000, false);
        try {
            System.out.println("Attempting large international transfer...");
            corpAcc.withdraw(600000);
        } catch (TaxComplianceException | DailyLimitExceededException | InsufficientFundsException e) {
            System.err.println("Transaction Failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt logged for Account: " + corpAcc.accountNumber);
        }
    }
}
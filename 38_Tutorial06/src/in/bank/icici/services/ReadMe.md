## Custom Exceptions
* Throw InsufficientFundsException if a withdrawal amount exceeds the current balance. 
* Throw DailyLimitExceededException if a single transaction exceeds a pre-defined security limit (e.g., 100,000).
* Throw TaxComplianceException if a transfer to an international vendor exceeds 500,000 without a valid tax ID.

## Class Hierarchy
* Define a base class Account with customerName, accountNumber, balance, and a method withdraw(double amount) that throws above exceptions.
* Inherit CorporateAccount  from Account and override the withdrawal method to include an additional check for a TaxComplianceException.

## Demo Class
* Create a BankingSystemDemo class to simulate various transaction scenarios, utilizing try-catch-finally blocks to log transaction attempts and handle errors gracefully.
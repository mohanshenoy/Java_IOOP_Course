/*
 * Additoinal QS 1.	Throw an InvalidSalaryException if the salary of an employee 
 * is less than the minimum wage (50,000). Throw a 
 * ContractLimitExceededException if a contract employee's work duration 
 * exceeds the maximum allowed period (24 months). Create these exception 
 * classes by extending Exception. Create Employee base class with 
 * attributes name and salary Add a method setSalary(double salary) 
 * that throws InvalidSalaryException if the salary is below 50,000. 
 * Provide methods to display employee details.  
 * Create ContractEmployee inherits Employee class. 
 * Add an attribute contractDuration (in months). 
 * Add a method setContractDuration(int months) that throws 
 * ContractLimitExceededException if the duration exceeds 24 months. 
 * Provide methods to display contract details. 
 * Create EmployeeExceptionDemo class with main method. 
 * Also, demonstrate the working of the custom exceptions 
 * using try-catch blocks.

 */
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}
class ContractLimitExceededException extends Exception {
    public ContractLimitExceededException(String message) {
        super(message);
    }
}
class Employee {
    protected String name;
    protected double salary;
    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary < 50000) {
            throw new InvalidSalaryException("Salary " + salary + " is below minimum wage (50,000).");
        }
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee: " + name + " | Salary: " + salary);
    }
}
class ContractEmployee extends Employee {
    private int contractDuration;
    public ContractEmployee(String name) {
        this.name = name;
    }
    public void setContractDuration(int months) throws ContractLimitExceededException {
        if (months > 24) {
            throw new ContractLimitExceededException("Duration " + months + " months exceeds the 24-month limit.");
        }
        this.contractDuration = months;
    }
    public void displayContractDetails() {
        super.displayDetails();
        System.out.println("Contract Duration: " + contractDuration + " months");
    }
}
public class EmployeeExceptionDemo {
    public static void main(String[] args) {
        ContractEmployee ce = new ContractEmployee("Kenn Nazareth");
        try {
            ce.setSalary(45000);
        } catch (InvalidSalaryException e) {
            System.out.println("Salary Error: " + e.getMessage());
        }
        System.out.println("................................................");
        try {
            ce.setSalary(60000);
            ce.setContractDuration(36);
        } catch (InvalidSalaryException | ContractLimitExceededException e) {
            System.out.println("Contract Error: " + e.getMessage());
        }
        System.out.println("................................................");
        try {
            ce.setContractDuration(12);
            ce.displayContractDetails();
        } catch (ContractLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
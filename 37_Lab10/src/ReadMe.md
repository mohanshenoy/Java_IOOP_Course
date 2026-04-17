* Throw an InvalidSalaryException if the salary of an employee is less than the minimum wage (50,000). 
* Throw a ContractLimitExceededException if a contract employee's work duration exceeds the maximum allowed period (24 months). 
* Create these exception classes by extending Exception. 
* Create Employee base class with attributes name and salary Add a method setSalary(double salary) that throws InvalidSalaryException if the salary is below 50,000. Provide methods to display employee details. 
* Create ContractEmployee inherits Employee class. Add an attribute contractDuration (in months). Add a method setContractDuration(int months) that throws ContractLimitExceededException if the duration exceeds 24 months. Provide methods to display contract details. 
* Create EmployeeExceptionDemo class with main method. Also, demonstrate the working of the custom exceptions using try-catch blocks.

/*
 * Define a java class Employee having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods:
 * a. read(): to read N employee details
 * b. display(): to display employee details
 * c. compute_net_sal(): to compute net salary
 * Write a Java program to read data of N employee and compute and display net salary of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary)
 */
class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public double computeNetSalary() {
        double da = basicSalary * 0.40;  
        double grossSalary = basicSalary + da;  
        double deduction = grossSalary * 0.10;  
        double netSalary = grossSalary - deduction;  
        return netSalary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Net Salary : "+ computeNetSalary());
    }
}

public class Slide_25 {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Arun Gupta", 5000); 

        emp.display();
    }
}

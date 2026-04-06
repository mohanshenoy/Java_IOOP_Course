package q2;

import java.util.Scanner;

class Employee {
    String ename;
    int eid;
    double basic, da, grossSal, netSal;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: "); ename = sc.next();
        System.out.print("Enter ID: "); eid = sc.nextInt();
        System.out.print("Enter Basic Salary: "); basic = sc.nextDouble();
    }
    void calculateSalary() {
        da = 0.52 * basic;
        grossSal = basic + da;
        netSal = grossSal - (0.30 * grossSal);
    }
    void displayEmployeeDetails() {
        System.out.println("ID: " + eid + " | Name: " + ename + " | Net Salary: " + netSal);
    }
}

class PartTimeEmp extends Employee {
    int hoursWorked;
    static final double hourlyRate = 500.0;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: "); ename = sc.next();
        System.out.print("Enter ID: "); eid = sc.nextInt();
        System.out.print("Enter Hours Worked: "); hoursWorked = sc.nextInt();
    }
    void calculateSalary() {
        netSal = hoursWorked * hourlyRate;
    }
    void displayEmployeeDetails() {
        System.out.println("ID: " + eid + " | Name: " + ename + " | Type: Part-Time");
        System.out.println("Hours: " + hoursWorked + " | Rate: " + hourlyRate + " | Total Pay: " + netSal);
    }
}
class FullTimeEmp extends Employee {
    double bonus, deductions;
    void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bonus: "); bonus = sc.nextDouble();
        System.out.print("Enter Deductions: "); deductions = sc.nextDouble();
    }
    void calculateSalary() {
        super.calculateSalary();
        netSal = netSal + bonus - deductions;
    }
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Type: Full-Time | Bonus: " + bonus + " | Deductions: " + deductions);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        FullTimeEmp ft = new FullTimeEmp();
        System.out.println("Reading Full-Time Employee ---------");
        ft.read(); ft.calculateSalary();
        System.out.println("Employee Details:");
        ft.displayEmployeeDetails();
        
        System.out.println("---------------------");
        
        PartTimeEmp pt = new PartTimeEmp();
        System.out.println("Reading Part-Time Employee --------");
        pt.read(); pt.calculateSalary();
        System.out.println("Employee Details:");
        pt.displayEmployeeDetails();

        
        
    }
}
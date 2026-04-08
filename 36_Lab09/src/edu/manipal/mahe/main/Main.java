package edu.manipal.mahe.main;
import edu.manipal.mahe.employee.Employee;
import edu.manipal.mahe.department.Department;
import edu.manipal.mahe.payroll.Payroll;
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Arun", 30, 50000.0);
        Department dept = new Department("IT Department", "Mr. XYZ", "Manipal");
        Payroll payroll = new Payroll(emp, dept);
        payroll.generatePaySlip();
    }
}
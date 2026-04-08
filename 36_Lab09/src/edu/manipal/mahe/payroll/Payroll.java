package edu.manipal.mahe.payroll;

import edu.manipal.mahe.employee.Employee;
import edu.manipal.mahe.department.Department;

public class Payroll {
    private Employee employee;
    private Department department;

    public Payroll(Employee employee, Department department) {
        this.employee = employee;
        this.department = department;
    }

    private double calculateNetSalary() {
        double da = 0.52 * employee.basicSalary;
        double grossSalary = employee.basicSalary + da;
        double incomeTax = 0.30 * grossSalary;
        return grossSalary - incomeTax;
    }

    public void generatePaySlip() {
        double netSalary = calculateNetSalary();
        System.out.println("Payslip for January 2025");
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee department name: " + department.getDepartmentName());
        System.out.println("Employee Net Salary: " + netSalary);
    }
}
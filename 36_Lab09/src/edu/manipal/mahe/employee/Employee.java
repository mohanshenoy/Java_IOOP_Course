package edu.manipal.mahe.employee;

public class Employee {
    private int employeeId;
    private String name;
    protected int age;
    public double basicSalary;
    public Employee(int employeeId, String name, int age, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }
    public String getName() { 
    		return name; 
    	}
    public int getAge() { 
    		return age; 
    	}
}
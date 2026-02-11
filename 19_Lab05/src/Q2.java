/*
 * 2a) Define a class Employee having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods: read(): to read N employee details 
 * display(): to display employee details 
 * compute_net_sal(): to compute net salary 
 * Write a Java program to read data of N employee and compute and display net salary of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary) 
 * 
 * 2b) Consider the already defined Employee class. Provide a default constructor, and parameterized constructor. Also provide a display method. Illustrate all the constructors as well as the display method by defining Employee objects. 
 * 
 * 2c) Implement an Employee class with an inner class named Department that handles department-related details. The inner class Department should: 
 * a) Contain fields for departmentName and location. 
 * b) Provide methods to set and display department details. 
 * The Employee class should: 
 * Contain fields for eName (employee name), salary, and an array of Department objects. Provide methods to: 
 * c) Add departments. 
 * d) Display employee details along with department information. 

 */
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
	}
}
class Employee {
	private String eName;
	private int eId;
	private double basic, da, grossSal, netSal;
	private double salary;
	private Department[] departments;
	private int deptCount = 0;

    class Department {
        String departmentName;
        String location;
        Department(String name, String location) {
            this.departmentName = name;
            this.location = location;
        }
        void displayDepartment() {
            System.out.println("Dept: " + departmentName + ", Location: " + location);
        }
    }

    public Employee() {
        this.departments = new Department[2]; 
    }

    public Employee(String name, int id, double basic) {
        this();
        this.eName = name;
        this.eId = id;
        this.basic = basic;
        computeNetSal();
    }

    public void computeNetSal() {
        this.da = 0.52 * basic;
        this.grossSal = basic + da;
        double it = 0.30 * grossSal;
        this.netSal = grossSal - it;
        this.salary = netSal;  
    }

    public void addDepartment(String name, String location) {
        if (deptCount < departments.length) {
            departments[deptCount++] = new Department(name, location);
        }
    }

    public void display() {
        System.out.println("******* Employee Details *******");
        System.out.println("ID: " + eId + ", Name: " + eName);
        System.out.println("Basic: " + basic + ", Net Salary: " + netSal);
        for (int i = 0; i < deptCount; i++) {
            departments[i].displayDepartment();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] emps = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name, ID, and Basic Salary: ");
            String name = sc.next();
            
            int id = sc.nextInt();
            sc.nextLine();
            
            double basic = sc.nextDouble();
            sc.nextLine();
            
            emps[i] = new Employee(name, id, basic);
            
            System.out.println("Enter Department Name and Location: ");
            emps[i].addDepartment(sc.next(), sc.next());
        }

        for (Employee e : emps) {
            e.display();
        }
    }
}
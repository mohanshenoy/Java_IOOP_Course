
/**
 * Define a class Employee having following members: 
 * Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and 
 * following methods: 
 * read(): to read N employee details 
 * display(): to display employee details 
 * compute_net_sal(): to compute net salary 
 * Write a Java program to read data of N employee and compute and display net salary of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary) 
 * Provide a default constructor, and parameterized constructor. 
 * Illustrate all the constructors as well as the display method by defining Employee objects. 
 */
import java.util.Scanner;

class Employee {
    String ename;
    int eid;
    double basic, da, grossSal, netSal;

    // Default Constructor
    public Employee() {
    	//nothing
    }
    
    // Parameterized Constructor
    public Employee(String name, int id, double basicPay) {
        this.ename = name;
        this.eid = id;
        this.basic = basicPay;
    }
    
    public void compute_net_sal() {
        da = 0.52 * basic;
        grossSal = basic + da;
        double it = 0.30 * grossSal;
        netSal = grossSal - it;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        eid = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
        compute_net_sal();
    }

    public void display() {
        System.out.println("ename="+ename+
    		" eid="+eid+
    		" basic="+basic+
	        " da="+da+
	        " grossSal="+grossSal+
	        " netSal="+netSal);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        

        
        // Illustrating Default Constructor
        Employee[] empList = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            empList[i] = new Employee();
            empList[i].read();
        }
        System.out.println("\n--- Employee Salary Details ---");
        for (Employee e : empList) {
        	e.compute_net_sal();
        	e.display();
        }
        
        
        // Illustrating Parameterized Constructor
        empList = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            
            System.out.print("Enter Name: ");
            sc.nextLine(); // clear buffer
            String name = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();

            empList[i] = new Employee(name, id, basic);
            empList[i].compute_net_sal();
        }
        System.out.println("\n--- Employee Salary Details ---");
        for (Employee e : empList) {
        	e.compute_net_sal();
        	e.display();
        }        
        
    }
}

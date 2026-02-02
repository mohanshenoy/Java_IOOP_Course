
/*
 * Define a java class Employee having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods:
 * a. read(): to read N employee details
 * b. display(): to display employee details
 * c. compute_net_sal(): to compute net salary
 * Write a Java program to read data of N employee and compute and display net salary of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary)
 */
import java.util.Scanner;

class Employee {
    String ename;
    int eid;
    double basic, da, grossSal, netSal;

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

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] empList = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            empList[i] = new Employee();
            empList[i].read();
        }

        System.out.println("\n--- Employee Salary Details ---");
        for (Employee e : empList) {
            e.display();
        }
    }
}
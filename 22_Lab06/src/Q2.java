
/*
 * 2a) Define a java class Employee having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods:
 * a) read(): to read N employee details
 * b) display(): to display employee details
 * c) compute_net_sal(): to compute net salary
 * Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary)
 * 
 * 2b) To the already defined Employee class, add the following string processing methods:
 * a) formatEmployeeName(): A method that formats the employee's name by capitalizing the first letter of each word and converting 
 * the remaining letters to lowercase. For example, if the employee's name is "JOHN DOE", this method would transform it to "John Doe". 
 * b) generateEmail(): A method that generates an email address for the employee based on their name. For example, 
 * if the employee's name is "John Doe", this method would generate an email address like jdoe@example.com.
 * Illustrate the above methods upon creating an array of Employee objects. The details of each Employee object must be read from 
 * the user and initialized using the parameterised constructor.
 */
import java.util.Scanner;

class Employee {

	String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

    public Employee(int Eid, String Ename, double Basic) {
        this.Eid = Eid;
        this.Ename = Ename;
        this.Basic = Basic;
    }

    public void compute_net_sal() {
        this.DA = 0.52 * Basic;
        this.Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        this.Net_Sal = Gross_Sal - IT;
    }

    public void formatEmployeeName() {
        String[] words = Ename.split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                formattedName.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1).toLowerCase())
                             .append(" ");
            }
        }
        this.Ename = formattedName.toString().trim();
    }

    public String generateEmail() {
        String[] words = Ename.split("\\s+");
        String emailPrefix = "";
        if (words.length >= 2) {
             // First letter of first name + last name
            emailPrefix = (words[0].substring(0, 1) + words[words.length - 1]).toLowerCase();
        } else {
            emailPrefix = words[0].toLowerCase();
        }
        return emailPrefix + "@example.com";
    }

    public void display() {
        System.out.println("Employee ID: " + Eid);
        System.out.println("Name: " + Ename);
        System.out.println("Email: " + generateEmail());
        System.out.printf("Basic: %.2f | DA: %.2f\n", Basic, DA);
        System.out.printf("Gross Salary: %.2f\n", Gross_Sal);
        System.out.printf("Net Salary: %.2f\n", Net_Sal);
        System.out.println("-------------------------");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of employees (N): ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Basic Salary: ");
            double basic = sc.nextDouble();

            employees[i] = new Employee(id, name, basic);
            
            employees[i].formatEmployeeName();
            employees[i].compute_net_sal();
        }

        System.out.println("************* Employee Details ************* ");
        for (Employee emp : employees) {
            emp.display();
        }
        System.out.println("************* Employee Details ************* ");
        sc.close();
    }
}
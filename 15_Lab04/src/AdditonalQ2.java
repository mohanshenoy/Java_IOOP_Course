
/**
 * Define a java class called Customer that holds private fields 
 * for a customer ID number, name and credit limit. 
 * Include appropriate constructors to initialize the instance variables 
 * of the Customer Class. Write a main() method that declares an array of 5 Customer objects. 
 * Prompt the user for values for each Customer, and 
 * display all 5 Customer objects. 
 */
import java.util.Scanner;

class Customer {
    private int id;
    private String name;
    private double creditLimit;
    public Customer(int id, String name, double creditLimit) {
        this.id = id;
        this.name = name;
        this.creditLimit = creditLimit;
    }
    public void display() {
        System.out.println("ID: " + id + " , Name: " + name + " , Credit Limit: " + creditLimit);
    }
}

public class AdditonalQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Customer[] customers = new Customer[5];
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Enter details for Customer " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            
            sc.nextLine();  
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Credit Limit: ");
            double limit = sc.nextDouble();

            customers[i] = new Customer(id, name, limit);
        }

        System.out.println("\n--- All Customer Records ---");
        for (Customer c : customers) {
            c.display();
        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * 1.	Write a Java program to accept the number of hours worked, 
 * hourly rate and calculates the salary for an employee according to the 
 * following criteria: The company pays straight time for the first 40 hours 
 * worked by each employee and time and a half for all hours 
 * worked in excess of 40 hours.
 * 
 */
public class Excercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();

        double salary;
        if (hours <= 40) {
            salary = hours * rate;
        } else {
        	double additonalHoursWorked = hours - 40;
        	double additonalHoursRate = rate * 1.5;
            salary = (40 * rate) + (additonalHoursWorked*additonalHoursRate);
        }

        System.out.printf("Total salary: $%.2f%n", salary);
    }
}
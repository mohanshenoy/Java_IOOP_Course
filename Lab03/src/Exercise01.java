/*
 * Define a Java Class Student having following Members: sname, marks_array, total, avg and provide the following methods:
 * a. assign(): to assign initial values to the Student object
 * b. display(): to display the Student object
 * c. compute(): to Compute Total, Average marks
 * Write a Java program Illustrating Class Declarations, Definition, and Accessing Class Members to test the class defined.
 */

import java.util.Scanner;

class Student {
    String sname;
    int[] marks_array = new int[5]; // Assuming 5 subjects
    int total;
    double avg;

    void assign() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        sname = sc.nextLine();
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            marks_array[i] = sc.nextInt();
        }
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = total / 5.0;
    }

    void display() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + sname);
        System.out.print("Marks: ");
        for (int mark : marks_array) {
        	System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.assign();
        s1.compute();
        s1.display();
    }
}
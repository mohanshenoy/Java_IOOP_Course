package test9;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter Student ID (nextInt): ");
        student.id = sc.nextInt(); // Reads integer, leaves \n in buffer

        // THE FIX: We must "consume" the leftover newline
        sc.nextLine(); 

        System.out.println("Enter Full Name (nextLine): ");
        // Without the fix above, this would be skipped!
        student.fullName = sc.nextLine(); 

        System.out.println("Enter GPA (nextDouble): ");
        student.gpa = sc.nextDouble(); 

        System.out.println("Enter Department (next - single word): ");
        student.department = sc.next(); // Reads only up to the first space

        student.display();
        
        sc.close();
    }
}
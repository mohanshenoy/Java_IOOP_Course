

/**
 * Write a Java program to manage student records using an array of objects.​
 */

/**
 * Scanner.nextLine() method reads a stream of text until it encounters a line separator (like \n), returning the entire string of characters up to that point. 
 * Unlike methods like next(), which stop at the first whitespace, nextLine() consumes the entire line including spaces.
 * Issue occurs when you use nextLine() immediately after a method like nextInt(). 
 * Because nextInt() leaves the newline character in the buffer, the subsequent nextLine() will read that empty newline and return an empty string instead of waiting for new input. To fix this , add an extra nextLine() to flush the buffer. 
 */
import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    int rollNumber;
    double marks;

    Student(String firstName, String lastName, int rollNumber, double marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void display() {
        System.out.print("firstName: " + firstName);
        System.out.print(", lastName: " + lastName);
        System.out.print(", Roll Number: " + rollNumber);
        System.out.print(", Marks: " + marks);
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numOfStudents];

        // Input student details
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

           
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(firstName, lastName, rollNumber, marks);
        }

        // Display student details
        System.out.println("\nStudent Records:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }

        scanner.close();
    }
}
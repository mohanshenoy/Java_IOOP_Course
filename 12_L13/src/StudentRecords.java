

/**
 * Write a Java program to manage student records using an array of objects.​
 */
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void display() {
        System.out.print("Name: " + name);
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

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, rollNumber, marks);
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
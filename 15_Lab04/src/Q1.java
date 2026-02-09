import java.util.Scanner;

/**
 * Define a Class STUDENT having following Members: 
 * sname, marks_array, total, avg and 
 * provide the following methods: 
 * assign(): to assign initial values to the STUDENT object 
 * display(): to display the STUDENT object 
 * compute(): to Compute Total, Average marks 
 * Provide a default constructor and parameterized constructor to this class. 
 * Illustrate all the constructors as well as the display method by defining STUDENT objects. 
 */

class Student {
    String sname;
    int[] marks_array = new int[5]; // Assuming 5 subjects
    int total;
    double avg;

    public Student() {
        this.sname = "Unknown";
        this.marks_array = new int[5];
    }

    public Student(String name, int[] marks) {
        this.sname = name;
        this.marks_array = marks;
    }

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

public class Q1 {
    public static void main(String[] args) {
    	
    	// Illustrating Default Constructor + assign()
        Student s1 = new Student();
        s1.assign();
        s1.compute();
        s1.display();

        // Illustrating Parameterized Constructor
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name for Student 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter 5 marks for Student 2: ");
        int[] marks2 = {
        		sc.nextInt(), 
        		sc.nextInt(), 
        		sc.nextInt(),
        		sc.nextInt(),
        		sc.nextInt()
        		};
        Student s2 = new Student("Arun", marks2);
        s2.compute();
        s2.display();
    }
}
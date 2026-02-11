/*
 * 1a) Define a Class STUDENT having following 
 * Members: sname, marks_array, total, avg and provide the following methods: 
 * assign(): to assign initial values to the STUDENT object 
 * display(): to display the STUDENT object 
 * compute(): to Compute Total, Average marks 
 * Write a Java program Illustrating Class Declarations, Definition, and Accessing Class Members to test the class defined. 
 
 * 1b) Consider the already defined STUDENT class. 
 * Provide a default constructor and parameterized constructor to this class. 
 * Also provide a display method. 
 * Illustrate all the constructors as well as the display method by defining STUDENT objects. 
 * 
 * 1c) Enhance the STUDENT class by adding an inner class named Subject that handles details of individual subjects. Where: The inner class Subject should: 
 * Contain fields for subjectName and marks. 
 * Provide methods to assign marks and display subject details. 
 * The STUDENT class should maintain an array of Subject objects. 
 * The STUDENT class should: 
 * Provide methods to add subjects. 
 * Calculate total and average marks by iterating over the Subject objects. 
 *  
 * COMBINED) Define a Student class, 
 * Add members variables: sname, total, avg. 
 * Provide a default constructor and parameterized constructor to this Student class.   
 * Update Student clas, add an inner class named Subject that handles details of individual subjects, where, it should
 * contain fields for subjectName and marks, 
 * provide methods to assign marks and display subject details. 
 * Update Student class , add member variable to maintain an array of Subject objects. 
 * Update Student class, should provide following methods to,
 * addSubject to add subject,
 * compute method to calculate total and average marks by iterating over the Subject objects. 
 * display method to display Student name, subject details ,total, average 
 */
import java.util.Scanner;

class Student {
	String sname;
	int total;
	double avg;
	Subject[] subjects;
	int subjectCount;
	
	class Subject {
		String subjectName;
		double marks;
		void assign(String sName, double marks) {
			this.subjectName = sName;
			this.marks = marks;
		}
		void displaySubject() {
			System.out.println("  Subject: " + subjectName + ", Marks: " + marks);
		}
	}

	Student(String sname, int subjectCount) {
		this.sname = sname;
		this.subjects = new Subject[subjectCount];
		this.subjectCount = 0;
	}

	void addSubject(String sName, double marks) {
		if (subjectCount < subjects.length) {
			subjects[subjectCount] = new Subject();
			subjects[subjectCount].assign(sName, marks);
			subjectCount++;
		}
	}
	void compute() {
		this.total = 0;
		for (int i = 0; i < subjectCount; i++) {
			total += subjects[i].marks;
		}
		this.avg = (subjectCount > 0) ? total / subjectCount : 0.0;
	}
	void display() {
		System.out.println("*********** Student Details *********** ");
		System.out.println("Name: " + sname);
		for (int i = 0; i < subjectCount; i++) {
			subjects[i].displaySubject();
		}
		System.out.println("Total: " + this.total);
		System.out.println("Average: " + this.avg);
	}
}

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter number of subjects: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Student s = new Student(name, num);
		for (int i = 0; i < num; i++) {
			System.out.print("Enter Subject " + (i + 1) + " Name: ");
			String subName = sc.next(); // Reads one word
			System.out.print("Enter Marks: ");
			double marks = sc.nextDouble();
			sc.nextLine();
			s.addSubject(subName, marks);
		}
		s.compute();
		s.display();
		sc.close();
	}
}
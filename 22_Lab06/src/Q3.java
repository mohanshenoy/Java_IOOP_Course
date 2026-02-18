/*
 * 3a) Define a Java Class Student having following Members: sname, marks_array, total, avg and 
 * provide the following methods:
 * a) assign(): to assign initial values to the Student object
 * b) display(): to display the Student object
 * c) compute(): to Compute Total, Average marks
 * 
 * 3b) To the already defined Student class, add the following methods:
 * a) extractInitials(): A method that extracts the initials from the student's name. 
 * For example, if the student's name is "John Doe", this method would return "JD".
 * b) removeWhitespace(): A method that removes any whitespace characters from the student's name. 
 * For example, if the student's name is "John Doe", this method would transform it to "JohnDoe". 
 * c) List all the student names containing a particular substring.
 * d) Sort the students alphabetically
 * In a separate class that contains main(), read the students details from console input. 
 * After displaying the details of all the students, illustrate the use of the above methods
 */
import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Student {
    String sname;
    int[] marks_array;
    int total;
    double avg;
    String initials;

    void assign(String name, int[] marks) {
        this.sname = name;
        this.marks_array = marks;
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (marks_array.length > 0) ? (double) total / marks_array.length : 0.0;
    }

    void display() {
    	System.out.println("Initials: " + initials );
        System.out.println("Name: " + sname );
        System.out.println("Total: " + total);
        System.out.println("Avg: " + avg);
    }

    void extractInitials() {
        StringBuilder initials = new StringBuilder();
        if (sname != null && !sname.isEmpty()) {
            for (String part : sname.trim().split("\\s+")) {
                initials.append(part.charAt(0));
            }
        }
        this.initials = initials.toString().toUpperCase();
    }

    void removeWhitespace() {
        if (sname != null) {
            sname = sname.replaceAll("\\s+", "");
        }
    }

    static void listWithSubstring(Student[] students, String sub) {
        System.out.println("Searching for substring '" + sub + "':");
        for (Student s : students) {
            if (s.sname.contains(sub)) {
                System.out.println(s.sname);
            }
        }
    }
    static void sortStudents(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.sname.compareToIgnoreCase(s2.sname));
        System.out.println("\n[Status] Students sorted alphabetically.");
    }
}

class StudentDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of students: ");
     int n = sc.nextInt();
     Student[] students = new Student[n];

     // Input Loop
     for (int i = 0; i < n; i++) {
         students[i] = new Student();
         sc.nextLine(); 
         System.out.println("Enter name for student " + (i + 1) + ": ");
         String name = sc.nextLine();
         System.out.println("Enter number of subjects: ");
         int subs = sc.nextInt();
         int[] marks = new int[subs];
         System.out.println("Enter marks: ");
         for (int j = 0; j < subs; j++) marks[j] = sc.nextInt();
         
         students[i].assign(name, marks);
         students[i].extractInitials();
         students[i].removeWhitespace();
         students[i].compute();
     }

     Student.sortStudents(students);
     System.out.println("--- Student Details (Sorted) ---");
     for (Student s : students) {
    	 s.display();
    	 System.out.println("--------------------");
     }

     Student.listWithSubstring(students, "a");

     sc.close();
 }
}


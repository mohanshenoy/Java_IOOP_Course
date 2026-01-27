
public class Slide32 {

	public static void main(String[] args) {
        // Marks for 3 subjects
        double[] marks = {80, 60, 86}; 
        
        // Creating student object using parameterized constructor
        Student s1 = new Student("REG123", "Arun", marks);
        
        // Computing and displaying details
        s1.computeResult();
        s1.displayDetails();
    }
}

class Student {
    String regNum;
    String name;
    double[] subjectWiseMarks;
    double totalMarks;
    char Grade;

    // Default constructor
    public Student() {
        this.regNum = "Unknown";
        this.name = "Unknown";
        this.subjectWiseMarks = new double[0];
        this.totalMarks = 0.0;
        this.Grade = 'F';
    }

    // Parameterized constructor
    public Student(String regNum, String name, double[] subjectWiseMarks) {
        this.regNum = regNum;
        this.name = name;
        this.subjectWiseMarks = subjectWiseMarks;
    }

    // Method to compute total marks and grade
    public void computeResult() {
        this.totalMarks = 0;
        for (double mark : subjectWiseMarks) {
            this.totalMarks += mark;
        }

        if (this.totalMarks >= 90) this.Grade = 'A';
        else if (this.totalMarks >= 80) this.Grade = 'B';
        else if (this.totalMarks >= 70) this.Grade = 'C';
        else if (this.totalMarks >= 60) this.Grade = 'D';
        else if (this.totalMarks >= 50) this.Grade = 'E';
        else this.Grade = 'F';
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Registration Number: " + regNum);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + Grade);
    }
}

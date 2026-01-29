public class Student {
    String regNum;
    String name;
    double[] subjectWiseMarks;
    double totalMarks;
    char Grade;

    public Student() {
        this.regNum = "Unknown";
        this.name = "Unknown";
        this.subjectWiseMarks = new double[0];
        this.totalMarks = 0.0;
        this.Grade = 'F';
    }

    public Student(String regNum, String name, double[] subjectWiseMarks) {
        this.regNum = regNum;
        this.name = name;
        this.subjectWiseMarks = subjectWiseMarks;
    }

    public void computeResult() {
        this.totalMarks = 0;
        for (double mark : subjectWiseMarks) {
            this.totalMarks += mark;
        }

        if (this.totalMarks >= 90) {
        	this.Grade = 'A';
        }
        else if (this.totalMarks >= 80) {
        	this.Grade = 'B';
        }
        else if (this.totalMarks >= 70) {
        	this.Grade = 'C';
        }
        else if (this.totalMarks >= 60) {
        	this.Grade = 'D';
        }
        else if (this.totalMarks >= 50) {
        	this.Grade = 'E';
        }
        else {
        	this.Grade = 'F';
        }
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + regNum);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + Grade);
    }

	public static void main(String[] args) {
        double[] marks = {80, 60, 86}; 
        Student s1 = new Student("2025123456", "Student1", marks);
        s1.computeResult();
        s1.displayDetails();
    }
}


package q1;

class Student {
    String sname;
    int[] marks_array = new int[3];
    double total;
    double avg;
    void assign(String name, int[] marks) {
        this.sname = name;
        this.marks_array = marks;
    }
    void compute() {
        total = 0;
        for (int m : marks_array) {
        	total += m;
        }
        avg = total / marks_array.length;
    }
    void display() {
        System.out.println("Name: " + sname + " | Total: " + total + " | Avg: " + avg);
    }
}

class ScienceStudent extends Student {
    int practicalMarks;
    ScienceStudent(String name, int[] marks, int practicalMarks) {
        super.assign(name, marks);
        this.practicalMarks = practicalMarks;
    }
    void compute() {
        super.compute(); // Calculate base marks first
        total = total+practicalMarks;
        avg = total / (marks_array.length + 1);
    }
    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

class ArtsStudent extends Student {
    String electiveSubject;
    ArtsStudent(String name, int[] marks, String electiveSubject) {
        super.assign(name, marks);
        this.electiveSubject = electiveSubject;
    }
    void display() {
        super.display();
        System.out.println("Elective: " + electiveSubject);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        int[] m1 = {80, 85, 90};
        Student s;
        System.out.println("***** Science Student ***** ");
        ScienceStudent scienceStudent = new ScienceStudent("Mohan Shenoy", m1, 95);
        s = scienceStudent;  
        s.compute();
        s.display();
        scienceStudent.displayPracticalMarks();

        System.out.println("***** Arts Student ***** ");
        ArtsStudent artsStudent = new ArtsStudent("Vinaya Shenoy", m1, "History");
        s = artsStudent;  
        s.compute();
        s.display();
    }
}
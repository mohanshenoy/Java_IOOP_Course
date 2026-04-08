package edu.manipal.mit.main;

import edu.manipal.mit.course.Course;
import edu.manipal.mit.registration.Registration;
import edu.manipal.mit.student.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 101, "AI/ML", 9.2);
        Course c1 = new Course("Object Oriented Programming", "Prof.Mohan Shenoy", 4);
        Registration reg = new Registration(s1, c1);
        reg.registerStudent();
    }
}
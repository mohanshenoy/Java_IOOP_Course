package edu.manipal.mit.registration;

import edu.manipal.mit.student.Student;
import edu.manipal.mit.course.Course;

public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void registerStudent() {
        System.out.println("Registration Successful!");
        //System.out.println("Student Name : " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Department: "+ student.getDepartment() +", GPA: "+ student.getGpa());
        System.out.println(student);
        //System.out.println("courseName: " + course.getCourseName() + ", Instructor: " + course.getInstructor() +", Credits: "+ course.getCredits() );
        System.out.println(course);
    }
}
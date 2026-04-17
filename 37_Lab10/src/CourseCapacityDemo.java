/*
 * 2.	Write a java program to manage course enrollment. 
 * If a course exceeds its capacity, throw a custom checked exception 
 * called CourseFullException. Create a Course class with private 
 * attributes courseName, capacity, and enrolledStudents. 
 * A method enrollStudent() that throws CourseFullException 
 * if the course is already full. Create a custom checked exception 
 * CourseFullException. Write a CourseCapacityDemo class 
 * to enroll students in a course, Handle the CourseFullException 
 * when the course is full.
 */
class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}
class Course {
    private String courseName;
    private int capacity;
    private int enrolledStudents = 0;
    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
    }

    public void enrollStudent() throws CourseFullException {
        if (enrolledStudents >= capacity) {
            throw new CourseFullException("Capacity reached for " + courseName);
        }
        enrolledStudents++;
        System.out.println("Student enrolled. Current count: " + enrolledStudents);
    }
}
public class CourseCapacityDemo {
    public static void main(String[] args) {
        Course javaCourse = new Course("Introduction to Object Oriented Programming", 2);
        try {
            javaCourse.enrollStudent();  
            javaCourse.enrollStudent();   
            javaCourse.enrollStudent();  
        } catch (CourseFullException e) {
            System.out.println("Registration Error: " + e.getMessage());
        }
    }
}
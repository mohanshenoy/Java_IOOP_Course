/*
 * 1.	Write a java program to validate the age of a student during 
 * their registration. If the age is not between 18 and 60, 
 * throw an IllegalArgumentException. Create Student class with 
 * Private attributes name and age. Add method 
 * registerStudent(String name, int age) that throws 
 * an IllegalArgumentException if the age is invalid 
 * (that is, not between 18 and 60) Write StudentAgeValidationDemo 
 * class to create instance of student class and invoke registerStudent 
 * method with valid and invalid data Catch the exception and display 
 * an error message for invalid input.
 * 
 */
class Student {
    private String name;
    private int age;

    public void registerStudent(String name, int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("Age must be between 18 and 60. Provided: " + age);
        }
        this.name = name;
        this.age = age;
        System.out.println("Registration successful for: " + name);
    }
}
public class StudentAgeValidationDemo {
    public static void main(String[] args) {
        Student student = new Student();

        try {
            student.registerStudent("Matt", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student.registerStudent("Kenn", 15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
 * 3.	Write a java program to calculate the average marks of a student. 
 * If the total marks are zero or the number of subjects is zero, 
 * throw an ArithmeticException to avoid division by zero. 
 * Create a Student class , add a method 
 * calculateAverage(int totalMarks, int numberOfSubjects) 
 * that throws ArithmeticException if numberOfSubjects is zero. 
 * Write a MarksValidationDemo class to invoke 
 * the calculateAverage method with valid and invalid data. 
 * Handle the exception and display an appropriate error message.
 */
package in.manipal.mahe.mit;

class Student {
    public double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Cannot calculate average: Number of subjects is zero.");
        }
        return (double) totalMarks / numberOfSubjects;
    }
}
public class MarksValidationDemo {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            double avg = student.calculateAverage(450, 5);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            student.calculateAverage(0, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
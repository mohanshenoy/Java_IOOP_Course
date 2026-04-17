class Student1 {
    public static double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Error: Number of subjects cannot be zero to avoid division by zero.");
        }
        return (double) totalMarks / numberOfSubjects;
    }
}

// Main class to demonstrate marks validation
public class MarksValidationDemo {
    public static void main(String[] args) {
        try {
            double avg1 = Student1.calculateAverage(450, 5);
            System.out.println("Average Marks: " + avg1);

            double avg2 = Student1.calculateAverage(400, 0);
            System.out.println("Average Marks: " + avg2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            double avg3 = Student1.calculateAverage(270, 3);
            System.out.println("Average Marks: " + avg3);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
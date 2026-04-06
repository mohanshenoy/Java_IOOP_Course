
/*
 * 3.	in Java, Design a class Student with the methods, getRollNum() 
 * and putRollNum() to read and display the Roll No. of each student; 
 * and getMarks() and putMarks() to display and read their marks.
 * Create an interface called Sports with a method putSportsScore() that 
 * will set the score obtained by a student in physical education examination. 
 * Design a class called Result that will implement this interface to 
 * generate the result by considering both the marks and sports score.
 */
class Student {
    int rollNumber;
    double[] marks;
    void putRollNum(int rollNumber) {
    	this.rollNumber = rollNumber;
    }
    void getRollNum() {
    	System.out.println("Roll No: " + rollNumber);
        
    }
    void putMarks(double[] marks) {
        this.marks = marks;
    }
    void getMarks() {
    	for (int i = 0; i < marks.length; i++) {
            System.out.println("Academic Marks: " + marks[i]);
		}
    }

}

interface Sports {
    void putSportsScore(double score);
}

class Result extends Student implements Sports {
	double sportScore;
	double total;

    public void putSportsScore(double sportScore) {
        this.sportScore = sportScore;
    }

    void displayResult() {
    	double academicScore=0;
    	for (int i = 0; i < marks.length; i++) {
    		academicScore+= marks[i];
		}
        total = academicScore + sportScore;
        System.out.println("Sports Score: " + sportScore);
        System.out.println("Total Score: " + total);
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Result result = new Result();
        result.putRollNum(100);
        
        double[] marks = { 98,99,100};
        result.putMarks(marks);
        result.putSportsScore(97);
        
        System.out.println(" >>>>> Student Result Card <<<< ");
        result.getRollNum();
        result.getMarks();
        result.displayResult();
    }
}
package temp7;

public class Slide15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Student {
    String name;
    int age;

    // Constructor with parameters using the this keyword to refer to instance variables
    public Student(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable
        this.age = age;   // 'this.age' refers to the instance variable 
    }

    // Default constructor using the this keyword to call another constructor
    public Student() {
        this("Unknown", 0); // Calls the parameterized constructor 
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + this.name); // Using this for clarity
        System.out.println("Student Age: " + this.age);
    }
}

class CollectStudentInfo { 
	public static void main(String args[]) 	{
		Student student1 = new Student("Janvi", 20);
		student1.displayDetails();
	}
}

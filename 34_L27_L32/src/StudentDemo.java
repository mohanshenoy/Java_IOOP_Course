class Student {
    private String name;
    private int age;

    public Student(String name, int age) {// Constructor to initialize name and age
        this.name = name;
        this.age = age;
    }

    public static void registerStudent(String name, int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException(" Error: Age must be between 18 and 60. Given age: " + age);
        }
        System.out.println("Registration successful! Welcome, " + name + " (Age: " + age + ")");
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        try {
            Student.registerStudent("Alice", 25);
            Student.registerStudent("Bob", 16);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            Student.registerStudent("Charlie", 65);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
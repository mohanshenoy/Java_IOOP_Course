package test9;

class Student {
    String fullName;
    int id;
    double gpa;
    String department;

    void display() {
        System.out.println("------- Student Details -------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("GPA: " + gpa);
        System.out.println("Dept: " + department);
    }
}
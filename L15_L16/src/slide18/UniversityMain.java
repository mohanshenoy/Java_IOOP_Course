package slide18;

class University {
    private String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }
    class Department {
        private String departmentName;
        Department(String departmentName) {
            this.departmentName = departmentName;
        }
        void displayDetails() {
            System.out.println("University: " + universityName);
            System.out.println("Department: " + departmentName);
        }
    }
}
public class UniversityMain {
    public static void main(String[] args) {
        University university = new University("MAHE");
        University.Department department = university.new Department("Computer Science");
        department.displayDetails();
    }
}
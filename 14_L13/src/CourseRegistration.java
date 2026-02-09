
/**
 * Write a Java program to manage a course registration system.
 * Each course should have a name, code, and maximum enrollment. 
 * Implement methods to add a course, display all courses, 
 * and find a course by code.
 */

class Course {
    String name;
    String code;
    int maxEnrollment;

    Course(String name, String code, int maxEnrollment) {
        this.name = name;
        this.code = code;
        this.maxEnrollment = maxEnrollment;
    }

    void displayInfo() {
        System.out.println("Name:" + name + ", Code:" + code + ", Max Enrollment:" + maxEnrollment);
    }
}

public class CourseRegistration {
    static Course[] courses = new Course[3];
    static int courseCount = 0;

    public static void main(String[] args) {
        addCourse("Math", "M101", 30);
        addCourse("Physics", "P101", 25);
        addCourse("Chemistry", "C101", 20);

        System.out.println("All courses:");
        displayAllCourses();

        System.out.println("\nCourse with Code 'P101':");
        findCourseByCode("P101");
    }

    static void addCourse(String name, String code, int maxEnrollment) {
        if (courseCount < courses.length) {
            courses[courseCount++] = new Course(name, code, maxEnrollment);
        } else {
            System.out.println("Course array is full.");
        }
    }

    static void displayAllCourses() {
        for (Course course : courses) {
            course.displayInfo();
        }
    }

    static void findCourseByCode(String code) {
        for (Course course : courses) {
            if (course.code.equals(code)) {
                course.displayInfo();
                return;
            }
        }
        System.out.println("Course with Code " + code + " not found.");
    }
}
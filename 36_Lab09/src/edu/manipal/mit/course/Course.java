package edu.manipal.mit.course;

public class Course {
    private String courseName;
    protected String instructor;
    public int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getCourseName() { 
    		return courseName; 
    	}
    public String getInstructor() { 
    		return instructor; 
    	}

	public int getCredits() {
		return credits;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", instructor=" + instructor + ", credits=" + credits
				+ ", toString()=" + super.toString() + "]";
	}
    
}
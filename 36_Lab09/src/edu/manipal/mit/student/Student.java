package edu.manipal.mit.student;

public class Student {
    private String name;
    private int rollNumber;
    protected String department;
    public double gpa;

    public Student(String name, int rollNumber, String department, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.gpa = gpa;
    }

    public String getName() { 
    		return name; 
    	}
    public int getRollNumber() { 
    		return rollNumber; 
    	}
    public String getDepartment() { 
    		return department; 
    	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", department=" + department + ", gpa=" + gpa
				+ "]";
	}
	
    
}
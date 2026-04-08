package edu.manipal.mahe.department;

public class Department {
    private String departmentName;
    protected String manager;
    public String location;

    public Department(String departmentName, String manager, String location) {
        this.departmentName = departmentName;
        this.manager = manager;
        this.location = location;
    }

    public String getDepartmentName() { 
    		return departmentName; 
    	}
}
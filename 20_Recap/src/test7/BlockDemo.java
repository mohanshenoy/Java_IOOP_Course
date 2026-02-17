package test7;

import java.util.Random;


class Student {
    String name;
    long id;
    static int pinCode=0;
    
    static {
    	pinCode = +1;
    	System.out.println("inside static Block.......");
    }
    
    //add one or more non static block
    //explain the slide added
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //  This runs BEFORE the constructor for every new object.
    {
        System.out.println("Instance Block: Generating unique ID...");
        Random rand = new Random();
        this.id = Math.abs(rand.nextInt());
    }

    //add one more non static block and check

    Student() {
        System.out.println("Constructor 1: Default Student created.");
        this.name = "Unknown";
    }
    Student(String name) {
        System.out.println("Constructor 2: Student " + name + " created.");
        this.name = name;
    }
}

public class BlockDemo {
    public static void main(String[] args) {
    	
        System.out.println("Creating Student 1 ---");
        Student s1 = new Student();  
        System.out.println("ID: " + s1.id);

        System.out.println("");
        
        System.out.println("Creating Student 2 ---");
        Student s2 = new Student("Mohan");  
        System.out.println("ID: " + s2.id);
    }
}
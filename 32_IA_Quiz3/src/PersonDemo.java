class Person { 
	void message() { 
		System.out.print("C"); 
	} 
}
class Student extends Person {
    void message() { 
    	System.out.print("G"); 
    }
    void display() { 
    	message(); 
    	super.message(); 
   }
}
public class PersonDemo {
	public static void main(String[] args) { 
		new Student().display();
	} 	
}
//A) CG 
//B) GC *** 
//C) Compilation Error   
//D) Runtime Error 
